package br.com.andersonfariasdev.designpatterns.adapter.payoneer;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public interface IPayoneerPayments {
    Token authToken();
    void sendPayment();
    void recivePayment();
}
