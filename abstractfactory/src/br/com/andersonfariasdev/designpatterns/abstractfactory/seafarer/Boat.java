package br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer;

public class Boat implements ISeafarer {
    @Override
    public void startRoute() {
        seaTurmoil();
        getCargo();
        System.out.println("Boat: Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Boat: Já pegamos a encomenda");
    }

    @Override
    public void seaTurmoil() {
        System.out.println("Boat: Mar com pouca agitação.");
    }
}
