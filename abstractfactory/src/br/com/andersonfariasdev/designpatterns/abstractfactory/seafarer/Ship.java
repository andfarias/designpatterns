package br.com.andersonfariasdev.designpatterns.abstractfactory.seafarer;

public class Ship implements ISeafarer {
    @Override
    public void startRoute() {
        seaTurmoil();
        getCargo();
        System.out.println("Ship: Iniciando a entrega");
    }

    @Override
    public void getCargo() {
        System.out.println("Ship: Já pegamos a encomenda");
    }

    @Override
    public void seaTurmoil() {
        System.out.println("Ship: Mar com pouca agitação.");
    }
}
