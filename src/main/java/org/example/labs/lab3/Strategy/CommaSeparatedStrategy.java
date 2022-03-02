package org.example.labs.lab3.Strategy;

import org.jetbrains.annotations.NotNull;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class CommaSeparatedStrategy implements Strategy {
    @NotNull
    public String process(@NotNull List<String> strings) {
        return StringUtils.join(strings, ",");
    }
}
