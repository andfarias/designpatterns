package br.com.andersonfariasdev.designpatterns.abstractfactory.app;

import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.IAircraft;
import br.com.andersonfariasdev.designpatterns.abstractfactory.factories.ITransportFactory;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.ILandVehicle;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
