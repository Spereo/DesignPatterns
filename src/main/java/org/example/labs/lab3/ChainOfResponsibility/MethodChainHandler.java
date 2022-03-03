package org.example.labs.lab3.ChainOfResponsibility;

import org.jetbrains.annotations.NotNull;

public class MethodChainHandler extends AbstractChainHandler {
    private static final String KEY = "method";

    void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY)) {
            request.setMethod(request.getHeaders().get(KEY));
        }
    }
}
