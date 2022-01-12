package br.com.andersonfariasdev.designpatterns.builder.builders;

import br.com.andersonfariasdev.designpatterns.builder.cars.Car;
import br.com.andersonfariasdev.designpatterns.builder.components.CarType;
import br.com.andersonfariasdev.designpatterns.builder.components.Engine;
import br.com.andersonfariasdev.designpatterns.builder.components.Transmission;

public class CarBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;

    @Override
    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Car getResult() {
        return new Car(carType, seats, engine, transmission);
    }
}
