package br.com.andersonfariasdev.designpatterns.abstractfactory.factories;

import br.com.andersonfariasdev.designpatterns.abstractfactory.aircrafts.IAircraft;
import br.com.andersonfariasdev.designpatterns.abstractfactory.landvehicles.ILandVehicle;
import br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer.ISeafarer;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
    ISeafarer createTransportSeafarer();
}
