package org.example.labs.lab3.ChainOfResponsibility;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public abstract class AbstractChainHandler implements ChainHandler {
    private ChainHandler chainHandler;

    public ChainHandler next() { return chainHandler; }

    public ChainHandler next(ChainHandler chainHandler) {
        this.chainHandler = chainHandler;
        return chainHandler;
    }

    private void validate(@NotNull Request request) {
        if(Objects.isNull(request)) {
            throw new RuntimeException("Request must not be null");
        }
    }

    abstract void handle(@NotNull Request request);

    public void process(@NotNull Request request) {
        validate(request);
        handle(request);
        if(Objects.nonNull(next())) {
            next().process(request);
        }
    }
}
