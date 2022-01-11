package br.com.andersonfariasdev.designpatterns.factorymethod.vehicles;

public class Bike implements IVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Inicianddo o delivery");
    }

    @Override
    public void getCargo() {
        System.out.println("Já pegamos a comida");
    }
}
