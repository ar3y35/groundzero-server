package org.groundzero.net.protocol;

import java.util.List;
import java.util.Objects;

/**
 * @author Albert Reyes
 *
 * @since Java 8
 * @see HTTP/1.1, RFC7231
 */
public class WebRequestHeader {
    private final String uri;
    private final String protocolVersion;

    private String host;

    private List<String> contentTypes;
    private List<String> contentCodings;
    private List<String> contentEncodings;
    private List<String> contentLanguages;
    private List<String> acceptedLanguages;
    private RequestMethod method;
    private List<String> accepted;

    protected WebRequestHeader(final RequestMethod method, final String url, final String address) {
        this.method = Objects.requireNonNull(method, "HTTP method is required");
        this.uri = Objects.requireNonNull(url, "URL is required");
        this.protocolVersion = Objects.requireNonNull(address, "Address is required");
    }

    public  RequestMethod getMethod() {
        return method;
    }

    public String getUri() {
        return uri;
    }

    public String getProtocolVersion() {
        return protocolVersion;
    }
}
