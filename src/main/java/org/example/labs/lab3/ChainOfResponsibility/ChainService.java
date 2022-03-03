package org.example.labs.lab3.ChainOfResponsibility;

public class ChainService {
    String inputStream;

    public void execute(String inputStream) {
        this.inputStream = inputStream;
        Request request = getRequest();
        String result = "Method: " + request.getMethod()
                    + "\nPath: " + request.getPath()
                    + "\nSession: " + request.getSession() + "\n";
        System.out.println(result);
    }

    private Request getRequest() {
        Request request = new Request();
        request.setInputStream(inputStream);

        ChainHandler handler = new HeadersChainHandler();
        handler.next(new MethodChainHandler())
                .next(new PathChainHandler())
                .next(new SessionChainHandler());
        handler.process(request);

        return request;
    }
}
