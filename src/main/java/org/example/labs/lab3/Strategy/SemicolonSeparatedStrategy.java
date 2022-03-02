package org.example.labs.lab3.Strategy;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public class SemicolonSeparatedStrategy implements Strategy {
    @NotNull
    public String process(@NotNull List<String> strings) {
        return StringUtils.join(strings, ";");
    }
}
