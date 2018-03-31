package org.rawdoughnuts.server;

import java.net.Socket;

/**
 *
 */
public interface Server {
    void accept (Socket s);
}
