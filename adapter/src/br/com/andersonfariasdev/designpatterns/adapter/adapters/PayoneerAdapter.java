package br.com.andersonfariasdev.designpatterns.adapter.adapters;

import br.com.andersonfariasdev.designpatterns.adapter.payoneer.Payoneer;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.IPayPalPayments;
import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public class PayoneerAdapter implements IPayPalPayments {
    private Token token;
    private Payoneer payoneer;

    public PayoneerAdapter(Payoneer payoneer) {
        this.payoneer = payoneer;
        System.out.println("Adaptando o Payoneer utilizando os métodos padrão do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.payoneer.sendPayment();
    }

    @Override
    public void payPalReceive() {
        this.payoneer.recivePayment();
    }
}
