package org.rawdoughnuts.server;

import java.net.Socket;

public class ServerlRouter implements Router {
    protected final Server server;

    public ServerlRouter(final Server server) {
        this.server = server;
    }

    public void route(final Socket s) {
        server.accept(s);
    }
}
