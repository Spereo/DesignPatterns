package org.example.labs.lab3.ChainOfResponsibility;

import java.util.HashMap;
import java.util.Map;

public class Request {
    private String inputStream;
    private final Map<String, String> headers = new HashMap<>();
    private String method;
    private String session;
    private String path;

    public String getInputStream() { return inputStream; }
    public String getMethod() { return  method; }
    public String getSession() { return session; }
    public String getPath() { return path; }
    public Map<String, String> getHeaders() { return headers; }

    public Request setInputStream(String inputStream) {
        this.inputStream = inputStream;
        return this;
    }

    public Request setMethod(String method) {
        this.method = method;
        return this;
    }

    public Request setSession(String session) {
        this.session = session;
        return this;
    }

    public Request setPath(String path) {
        this.path = path;
        return this;
    }
}
