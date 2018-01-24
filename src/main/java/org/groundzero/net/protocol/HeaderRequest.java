package org.groundzero.net.protocol;

import java.util.Objects;

public class HeaderRequest {
    private final String method;
    private final String url;
    private final String address;

    protected HeaderRequest(final String method, final String url, final String address) {
        this.method = Objects.requireNonNull(method, "HTTP method is required");
        this.url = Objects.requireNonNull(url, "URL is required");
        this.address = Objects.requireNonNull(address, "Address is required");
    }
}
