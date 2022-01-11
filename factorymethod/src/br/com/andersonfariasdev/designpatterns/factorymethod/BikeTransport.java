package br.com.andersonfariasdev.designpatterns.factorymethod;

import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.Bike;
import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
