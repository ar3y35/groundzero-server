package org.groundzero.net.protocol;

import java.net.Socket;
import java.util.Objects;

/**
 * @author Albert Reyes
 *
 * @since Java 8
 * @see HTTP/1.1
 */
public class WebRequestHeader {
    private final String method;
    private final String uri;
    private final String protocolVersion;
    private String host;

    protected WebRequestHeader(final String method, final String url, final String address) {
        this.method = Objects.requireNonNull(method, "HTTP method is required");
        this.uri = Objects.requireNonNull(url, "URL is required");
        this.protocolVersion = Objects.requireNonNull(address, "Address is required");
    }

    public String getMethod() {
        return method;
    }

    public String getUri() {
        return uri;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }
}
