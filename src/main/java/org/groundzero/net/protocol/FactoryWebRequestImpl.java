package org.groundzero.net.protocol;

import java.io.BufferedReader;
import java.io.IOException;

public class FactoryWebRequestImpl implements FactoryWebRequest {
    public WebRequest newWebRequest (final BufferedReader reader) throws IOException {
        String requestLine = reader.readLine();
        String[] elements = requestLine.split("[ ]+");
        String method = elements[0];
        String uri = elements[1];
        String protocolVersion = elements[2];

        return new WebRequest(new WebRequestHeader(method, uri, protocolVersion));
    }
}
