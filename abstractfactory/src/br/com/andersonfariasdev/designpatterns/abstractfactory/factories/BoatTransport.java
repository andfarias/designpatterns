package br.com.andersonfariasdev.designpatterns.abstractfactory.factories;

import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.Airplane;
import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.IAircraft;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.Car;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer.ISeafarer;
import br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer.Ship;

public class BoatTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public ISeafarer createTransportSeafarer() {
        return new Ship();
    }
}
