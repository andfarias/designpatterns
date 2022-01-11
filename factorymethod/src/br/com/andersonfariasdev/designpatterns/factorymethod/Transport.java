package br.com.andersonfariasdev.designpatterns.factorymethod;

import br.com.andersonfariasdev.designpatterns.factorymethod.vehicles.IVehicle;

public abstract class Transport {
    void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
