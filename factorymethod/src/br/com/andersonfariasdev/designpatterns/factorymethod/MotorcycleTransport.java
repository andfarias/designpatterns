package br.com.andersonfariasdev.designpatterns.factorymethod;

import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.IVehicle;
import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
