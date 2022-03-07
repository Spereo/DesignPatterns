package org.example.labs.lab3.Strategy;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface StrategyService {
    String execute(List<String> strings);
    StrategyService setStrategy(@NotNull Strategy strategy);
}
