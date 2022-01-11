package br.com.andersonfariasdev.designpatterns.abstractfactory.factories;

import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.Helicopter;
import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.IAircraft;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
