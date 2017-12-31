package org.groundzero.net;

import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;

public class WebListenerTest {
    private WebListener listener;

    @Test
    public void testWebListener () throws IOException {
        WebListener l = null;
        try {
            l = new WebListener(new ServerSocket(8080));
            l.activate();
            l.deactivate();
        } catch (IOException e) {
            l.deactivate();
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}