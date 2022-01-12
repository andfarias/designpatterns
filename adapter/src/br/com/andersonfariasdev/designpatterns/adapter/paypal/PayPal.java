package br.com.andersonfariasdev.designpatterns.adapter.paypal;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public class PayPal implements IPayPalPayments {
    private Token token;
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.token = authToken();
        System.out.println("Enviando pagamentos com PayPal");
    }

    @Override
    public void payPalReceive() {
        System.out.println("Recebendo pagamentos via PayPal");
    }
}
