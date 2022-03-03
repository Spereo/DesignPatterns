package org.example.labs.lab3.ChainOfResponsibility;

import org.jetbrains.annotations.NotNull;

public class PathChainHandler extends AbstractChainHandler {
    private static final String KEY = "path";

    void handle(@NotNull Request request) {
        if(request.getHeaders().containsKey(KEY)) {
            request.setPath(request.getHeaders().get(KEY));
        }
    }
}
