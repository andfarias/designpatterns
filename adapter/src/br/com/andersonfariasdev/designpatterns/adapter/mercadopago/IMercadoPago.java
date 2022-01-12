package br.com.andersonfariasdev.designpatterns.adapter.mercadopago;

import br.com.andersonfariasdev.designpatterns.adapter.utils.Token;

public interface IMercadoPago {
    Token authToken();
    void mercadoPagoPayment();
    void mercadoPagoRecivePayment();
}
