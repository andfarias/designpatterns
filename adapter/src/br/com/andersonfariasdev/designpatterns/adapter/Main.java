package br.com.andersonfariasdev.designpatterns.adapter;

import br.com.andersonfariasdev.designpatterns.adapter.adapters.PayoneerAdapter;
import br.com.andersonfariasdev.designpatterns.adapter.payoneer.Payoneer;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.IPayPalPayments;
import br.com.andersonfariasdev.designpatterns.adapter.paypal.PayPal;

public class Main {

    public static void main(String[] args) {
        IPayPalPayments payments = new PayoneerAdapter(new Payoneer());
        payments.payPalPayment();
        payments.payPalReceive();
    }
}
