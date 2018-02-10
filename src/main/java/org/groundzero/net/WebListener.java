package org.groundzero.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/**
 * Listens for internet traffic on a specified address/port.  When traffic is received a Socket is created and routed
 * somewhere else freeing this class to listen for more traffic.  This class is not thread safe.  This class will not
 * close or modify the required ServerSocket.
 *
 * @author Albert Reyes
 * @since Java 1.8
 */
public class WebListener implements Listener {
    protected final ServerSocket socket;
    protected final ConnectionQueue connections;

    public WebListener (final ServerSocket s, final ConnectionQueue q) {
        socket = Objects.requireNonNull(s, "ServerSocket is required");
        connections = Objects.requireNonNull(q, "ConnectionQueue is required");
    }

    public void listen() {
        while (!socket.isClosed()) {
            try {
                Socket connection = socket.accept();
                connections.queue(connection);
            } catch (IOException e) {
                throw new RuntimeException("The listener stopped because of an exception", e);
            }
        }
    }
}
