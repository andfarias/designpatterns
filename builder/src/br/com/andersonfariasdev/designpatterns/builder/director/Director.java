package br.com.andersonfariasdev.designpatterns.builder.director;

import br.com.andersonfariasdev.designpatterns.builder.builders.IBuilder;
import br.com.andersonfariasdev.designpatterns.builder.components.CarType;
import br.com.andersonfariasdev.designpatterns.builder.components.Engine;
import br.com.andersonfariasdev.designpatterns.builder.components.Transmission;

public class Director {
    public void contructSedanCar(IBuilder builder) {
        builder.setCarType(CarType.SEDAN);
        builder.setSeats(5);
        builder.setEngine(new Engine(1600));
        builder.setTransmission(Transmission.AUTOMATIC);
    }

    public void contructTruck(IBuilder builder) {
        builder.setCarType(CarType.TRUCK);
        builder.setSeats(5);
        builder.setEngine(new Engine(13000));
        builder.setTransmission(Transmission.AUTOMATIC_SEQUENTIAL);
    }
}
