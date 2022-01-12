package br.com.andersonfariasdev.designpatterns.adapter.utils;

public class Token {
    private String token;

    public Token() {
        this.token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkRlc2lnbiBQYXR0ZXJzIiwiaWF0IjoxNTE2MjM5MDIyfQ.4unnkrd8V2gIg20zdapFWlazbrdr84hTjAb2_AvtLIo";
    }

    public String getToken() {
        return token;
    }
}
