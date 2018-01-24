package org.groundzero.net.protocol;

import java.net.Socket;

public class WebRequest {
    private final Socket socket;
    private final HeaderRequest header;

    public WebRequest (final Socket s) {
        socket = s;
        header = new HeaderRequest("","","");
    }
    public HeaderRequest getHeader () {
        return header;
    }
}
