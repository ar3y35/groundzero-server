package org.rawdoughnuts.server;

import java.net.Socket;

/**
 *
 */
public interface Container {
    ResourceRequester accept (Socket s);
}
