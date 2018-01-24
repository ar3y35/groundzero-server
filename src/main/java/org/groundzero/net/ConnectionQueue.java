package org.groundzero.net;

import java.net.Socket;

public interface ConnectionQueue {
    void queue (final Socket s);
}
