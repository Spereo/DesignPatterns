package org.example.labs.lab3.ChainOfResponsibility;

import org.jetbrains.annotations.NotNull;

public class SessionChainHandler extends AbstractChainHandler {
    private static final String KEY = "session";

    void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY)) {
            request.setSession(request.getHeaders().get(KEY));
        }
    }
}
