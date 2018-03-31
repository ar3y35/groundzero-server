package org.rawdoughnuts.server;

import java.net.Socket;

public interface Translator<T> {
    T translate (Socket s);
}
