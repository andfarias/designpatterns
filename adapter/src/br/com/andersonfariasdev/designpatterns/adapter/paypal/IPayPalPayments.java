package br.com.andersonfariasdev.designpatterns.adapter.paypal;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public interface IPayPalPayments {
    Token authToken();
    void payPalPayment();
    void payPalReceive();
}
