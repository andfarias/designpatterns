package br.com.andersonfariasdev.designpatterns.builder;

import br.com.andersonfariasdev.designpatterns.builder.builders.CarBuilder;
import br.com.andersonfariasdev.designpatterns.builder.builders.SportCarBuilder;
import br.com.andersonfariasdev.designpatterns.builder.builders.TruckBuilder;
import br.com.andersonfariasdev.designpatterns.builder.cars.Car;
import br.com.andersonfariasdev.designpatterns.builder.cars.SportCar;
import br.com.andersonfariasdev.designpatterns.builder.cars.Truck;
import br.com.andersonfariasdev.designpatterns.builder.director.Director;

public class Main {

    public static void main(String[] args) {
        Director director = new Director();

        //criando carro
        CarBuilder builder = new CarBuilder();
        director.contructSedanCar(builder);

        Car car = builder.getResult();
        System.out.println(car.getCarType() + " produzido com sucesso!");

        //criando caminhão
        TruckBuilder truckBuilder = new TruckBuilder();
        director.contructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();
        System.out.println(truck.result());

        //criando carro esportivo
        SportCarBuilder sportCarBuilder = new SportCarBuilder();
        director.contructSportCarBuilder(sportCarBuilder);

        SportCar sportCar = sportCarBuilder.getResult();
        System.out.println(sportCar);
    }
}
