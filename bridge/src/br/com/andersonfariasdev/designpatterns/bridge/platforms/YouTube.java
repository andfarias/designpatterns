package br.com.andersonfariasdev.designpatterns.bridge.platforms;

public class YouTube implements IPlatform {

    public YouTube() {
        configureRMTP();
        System.out.println("YouTube: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicação");
    }
}
