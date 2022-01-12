package br.com.andersonfariasdev.designpatterns.adapter.mercadopago;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public class MercadoPago implements IMercadoPago {
    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void mercadoPagoPayment() {
        System.out.println("Enviando pagamentos via MercadoPago");
    }

    @Override
    public void mercadoPagoRecivePayment() {
        System.out.println("Recebendo pagamento via MercadoPago");
    }
}
