package br.com.andersonfariasdev.designpatterns.chainofresponsibility.middlewares;

public class CheckPermissionMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("master@andersondev.com")) {
            System.out.println("Bem-vindo administrador!");
            return true;
        }
        System.out.println("Bem-vindo");
        return checkNext(email, password);
    }
}
