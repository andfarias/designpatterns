package br.com.andersonfariasdev.designpatterns.adapter.adapters;

import br.com.andersonfariasdev.designpatterns.adapter.mercadopago.MercadoPago;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.IPayPalPayments;
import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public class MercadoPagoAdapter implements IPayPalPayments {
    private Token token;
    private MercadoPago mercadoPago;

    public MercadoPagoAdapter(MercadoPago mercadoPago) {
        this.mercadoPago = mercadoPago;
        System.out.println("Adaptando o MercadoPago utilizando os métodos padrão do PayPal");
    }

    @Override
    public Token authToken() {
        return new Token();
    }

    @Override
    public void payPalPayment() {
        this.mercadoPago.mercadoPagoPayment();
    }

    @Override
    public void payPalReceive() {
        this.mercadoPago.mercadoPagoRecivePayment();
    }
}
