package org.groundzero.net;

import org.groundzero.net.protocol.FactoryWebRequestImpl;
import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.Executors;

public class WebListenerTest {
    //@Test
    public void testWebListenerStart () throws IOException {
        ServerSocket socket = null;
        try {
            socket = new ServerSocket(8080);
            ConnectionQueue pool = new WebConnectionQueue(Executors.newFixedThreadPool(10), new FactoryWebRequestImpl());
            new WebListener(socket, pool).listen();
        }finally {
            if (socket!=null) {
                socket.close();
            }
        }
    }

    @Test
    public void testWebListnerStop () {

    }
}