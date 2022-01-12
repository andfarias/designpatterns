package br.com.andersonfariasdev.designpatterns.builder.builders;

import br.com.andersonfariasdev.designpatterns.builder.components.CarType;
import br.com.andersonfariasdev.designpatterns.builder.components.Engine;
import br.com.andersonfariasdev.designpatterns.builder.components.Transmission;

public interface IBuilder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
}
