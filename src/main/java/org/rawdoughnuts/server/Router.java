package org.rawdoughnuts.server;

import java.net.Socket;

public interface Router {
    void route (final Socket s);
}
