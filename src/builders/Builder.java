package builders;

import components.Engine;
import components.GPSNavigator;
import components.Transmission;
import components.TripComputer;
import products.CarType;

// todas las posibles maneras de configurar un producto
public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
