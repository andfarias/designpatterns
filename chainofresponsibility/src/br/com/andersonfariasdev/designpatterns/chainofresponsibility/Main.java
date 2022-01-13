package br.com.andersonfariasdev.designpatterns.chainofresponsibility;

import br.com.andersonfariasdev.designpatterns.chainofresponsibility.middlewares.CheckPermissionMiddleware;
import br.com.andersonfariasdev.designpatterns.chainofresponsibility.middlewares.CheckUserMiddleware;
import br.com.andersonfariasdev.designpatterns.chainofresponsibility.middlewares.Middleware;
import br.com.andersonfariasdev.designpatterns.chainofresponsibility.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init() {
        server = new Server();
        server.registerUser("master@andersondev.com", "dfn#9GK34Y");
        server.registerUser("user@andersondev.com", "123456");

        Middleware middleware = new CheckUserMiddleware(server);
        middleware.linkWith(new CheckPermissionMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main(String[] args) throws IOException {
        init();
        boolean done;
        do {
            System.out.println("Digite o e-mail: ");
            String email = reader.readLine();
            System.out.println("Digite a sua senha: ");
            String password = reader.readLine();
            done = server.login(email, password);
        } while (!done);
    }
}
