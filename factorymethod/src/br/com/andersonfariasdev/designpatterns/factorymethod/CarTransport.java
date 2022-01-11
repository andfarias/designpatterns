package br.com.andersonfariasdev.designpatterns.factorymethod;

import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.Car;
import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.IVehicle;

public class CarTransport  extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
