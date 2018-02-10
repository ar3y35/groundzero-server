package org.groundzero.net.protocol;

import java.net.Socket;

/**
 * @author Albert Reyes
 *
 * @since Java 8
 * @see HTTP/1.1
 */
public class WebRequest {
    private final WebRequestHeader header;

    public WebRequest(final WebRequestHeader h) {
        header = h;
    }
    public WebRequestHeader getHeader () {
        return header;
    }
}
