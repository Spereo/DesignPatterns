package org.example.labs.lab3.ChainOfResponsibility;

import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

public class HeadersChainHandler extends AbstractChainHandler {
    private static final String DELIMITER = ":";

    void handle(@NotNull Request request) {
        String[] headers = StringUtils.split(request.getInputStream(), "\n");

        for(String header  : headers) {
            if(header.isEmpty()) { continue; }

            String[] arr = StringUtils.split(header, DELIMITER);
            if(arr.length == 0) { continue; }

            request.getHeaders().put(arr[0], arr[1]);
        }
    }
}
