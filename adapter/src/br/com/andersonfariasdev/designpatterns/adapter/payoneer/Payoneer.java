package br.com.andersonfariasdev.designpatterns.adapter.payoneer;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public class Payoneer implements IPayoneerPayments {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void sendPayment() {
        System.out.println("Enviando pagamentos via Payoneer");
    }

    @Override
    public void recivePayment() {
        System.out.println("Recebendo pagamento via Payoneer");
    }
}
