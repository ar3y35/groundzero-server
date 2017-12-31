package org.groundzero.net;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;

/**
 * Listens for internet traffic on a specified address/port.  A connection is created and delegated to a processor for
 * all requests directed at this listener.  This class is not thread safe.
 *
 * @author Albert Reyes
 * @since Java 1.8
 */
public class WebListener implements Listener {
    protected final ServerSocket socket;

    public WebListener (final ServerSocket s) {
        socket = Objects.requireNonNull(s);
    }

    public void activate() {
        try {
            System.out.println("Waiting for connection...");
            Socket connection = socket.accept();
            System.out.println("Socket connected " + connection.getInetAddress().getHostAddress() + " " + connection.getInetAddress().getHostName());
        } catch (IOException e) {
            try {
                socket.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
    }

    public void deactivate() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
