package org.rawdoughnuts.server;

import java.net.Socket;
import java.util.concurrent.ThreadPoolExecutor;

public abstract class TheardPoolServer<T> implements Server{
    protected final ThreadPoolExecutor pool;
    protected final Translator<T> translator;
    protected final FactoryResourceService<T> factory;

    public TheardPoolServer(ThreadPoolExecutor pool, Translator<T> translator, FactoryResourceService<T> factory) {
        this.pool = pool;
        this.translator = translator;
        this.factory = factory;
    }

    public void accept(final Socket s) {
        
        try {
            pool.execute(new Runnable() {
                public void run() {
                    T t = translator.translate(s);
                    factory.newResourceService(t).serve();
                }
            });
        } finally {

        }
    }
}
