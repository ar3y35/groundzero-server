package org.groundzero.net;

import org.junit.Test;

import java.io.IOException;
import java.net.Socket;

public class WebListenerTest2 {
    //@Test
    public void testConnection () throws IOException {
        Socket s = new Socket("localhost", 8080);
        s.close();
    }
}
