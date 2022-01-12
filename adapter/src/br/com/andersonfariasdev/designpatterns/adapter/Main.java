package br.com.andersonfariasdev.designpatterns.adapter;

import br.com.andersonfariasdev.designpatterns.adapter.adapters.MercadoPagoAdapter;
import br.com.andersonfariasdev.designpatterns.adapter.adapters.PayoneerAdapter;
import br.com.andersonfariasdev.designpatterns.adapter.mercadopago.MercadoPago;
import br.com.andersonfariasdev.designpatterns.adapter.payoneer.Payoneer;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.IPayPalPayments;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        //realizando pagamentos com PayPal
        IPayPalPayments payment = new PayPal();
        payment.payPalPayment();
        payment.payPalReceive();

        //realizando pagamentos com Payoneer
        IPayPalPayments paymentPayoneer = new PayoneerAdapter(new Payoneer());
        paymentPayoneer.payPalPayment();
        paymentPayoneer.payPalReceive();

        //realizando pagamentos com MercadoPago
        IPayPalPayments paymentMercadoPago = new MercadoPagoAdapter(new MercadoPago());
        paymentMercadoPago.payPalPayment();
        paymentMercadoPago.payPalReceive();
    }
}
