package br.com.andersonfariasdev.designpatterns.bridge.platforms;

public class TwitchTV implements IPlatform {

    public TwitchTV() {
        configureRMTP();
        System.out.println("TwitchTV: Transmissão iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTV: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTV: Autorizando aplicação");
    }
}
