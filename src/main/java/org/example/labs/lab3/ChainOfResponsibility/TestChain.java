package org.example.labs.lab3.ChainOfResponsibility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class TestChain {
    @Test
    public void testChainService() {
        String inputStream = "method:GET\npath:/user/info\nsession:hfhfhf-dhdhdhdhf-ayeye76";
        ChainService service = new ChainService();
        String message = service.execute(inputStream);
        String expectedMessage = "Method: GET\nPath: /user/info\nSession: hfhfhf-dhdhdhdhf-ayeye76\n";
        assertEquals(expectedMessage, message);

    }

    @Test
    public void testRequest() {
        final String testString = "test";

        Request request = new Request();
        assertEquals(request, request.setInputStream(testString));
        assertEquals(request, request.setMethod(testString));
        assertEquals(request, request.setPath(testString));
        assertEquals(request, request.setSession(testString));

        assertEquals(testString, request.getInputStream());
        assertEquals(testString, request.getMethod());
        assertEquals(testString, request.getPath());
        assertEquals(testString, request.getSession());
    }
}
