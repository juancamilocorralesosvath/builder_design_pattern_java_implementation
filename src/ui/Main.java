package ui;

import builders.CarBuilder;
import builders.CarManualBuilder;
import director.Director;
import products.Car;
import products.Manual;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        /*
        * el director recibe el constructor concreto desde la aplicacion
        * */
        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);

        /*
        * el producto final se recibe desde un objeto constructor, porque el director
        * no es consciente de los constructores concretos y productos.
        * */
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.getCarType());


        CarManualBuilder manualBuilder = new CarManualBuilder();


        director.constructSportsCar(manualBuilder);
        Manual carManual = manualBuilder.getResult();
        System.out.println("\nCar manual built:\n" + carManual.print());
    }
}