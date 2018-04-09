package org.rawdoughnuts.server;

import java.net.Socket;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class ThreadPoolServer<T> implements Server {
    private final ThreadPoolExecutor pool;
    private final Translator<T> translator;
    private final FactoryResourceService<T> factory;

    public ThreadPoolServer(ThreadPoolExecutor pool, Translator<T> translator, FactoryResourceService<T> factory) {
        this.pool = pool;
        this.translator = translator;
        this.factory = factory;
    }

    public void accept(final Socket s) {
        pool.execute(new Runnable() {
            public void run() {
                T t = translator.translate(s);
                ResourceService service = factory.newResourceService(t);
                service.serve();
            }
        });
    }
}
