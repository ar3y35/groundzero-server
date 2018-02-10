package org.groundzero.net;

import org.groundzero.net.protocol.FactoryWebRequest;
import org.groundzero.net.protocol.FactoryWebRequestImpl;
import org.groundzero.net.protocol.WebRequest;
import org.groundzero.net.protocol.WebRequestHeader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Objects;
import java.util.concurrent.ExecutorService;

public class WebConnectionQueue implements ConnectionQueue {
    protected final ExecutorService pool;
    protected final FactoryWebRequest factory;

    public WebConnectionQueue(final ExecutorService e, final FactoryWebRequest f) {
        pool = Objects.requireNonNull(e, "ExecutorService is required");
        factory = Objects.requireNonNull(f, "FactoryWebRequest is required");
    }

    @Override
    public void queue(final Socket s) {
        try {
//            WebRequest request = factory.newWebRequest(new BufferedReader(new InputStreamReader(s.getInputStream())));
//            WebRequestHeader header = request.getHeader();
//            System.out.println("method: " + header.getMethod() + " uri: " + header.getUri() + " version: " + header.getProtocolVersion());

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            String str;
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }

        }catch (IOException e) {

        }
        pool.execute(new Runnable() {
            @Override
            public void run() {
                try {
                    PrintWriter out = new PrintWriter(s.getOutputStream());
                    String response = "<html><p> Executing on thread : " + Thread.currentThread() + "</p></html>";

                    out.println("HTTP/1.1 200 OK");
                    out.println("Content-Type: text/html");
                    out.println("Content-Length: " + response.length());
                    out.println();
                    out.println(response);
                    out.flush();
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {

                }
            }
        });
    }
}
