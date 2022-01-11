package br.com.andersonfariasdev.designpatterns.abstractfactory.app;

import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.IAircraft;
import br.com.andersonfariasdev.designpatterns.abstractfactory.factories.ITransportFactory;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer.ISeafarer;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;
    private ISeafarer seafarer;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        seafarer = factory.createTransportSeafarer();
    }

    public void startRoute() {
        vehicle.startRoute();
        aircraft.startRoute();
        seafarer.startRoute();
    }
}
