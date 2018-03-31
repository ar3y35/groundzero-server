package org.rawdoughnuts.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Listens for internet traffic on a specified address/port.  When traffic is received a Socket is created and routed
 * somewhere else freeing this class to listen for more traffic.  This class is not thread safe.  This class will not
 * close or modify the required ServerSocket.
 *
 * @author Albert Reyes
 */
public class ServerSocketListener implements Listener {
    protected final ServerSocket socket;
    protected final Router router;

    public ServerSocketListener(final ServerSocket s, final Router r) {
        if (s==null) {throw new NullPointerException("ServerSocket is required");}
        if (r==null) {throw new NullPointerException("Router is required");}
        socket = s;
        router = r;
    }

    public void listen() {
        while (!socket.isClosed()) {
            try {
                Socket request = socket.accept();
                router.route(request);
            } catch (IOException e) {
                throw new RuntimeException("The listener stopped because of an exception", e);
            }
        }
    }
}
