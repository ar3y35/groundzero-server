package org.groundzero.net;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/**
 * @author Albert Reyes
 */
public class ServletConfigImpl implements ServletConfig {
    protected final Map<String, String> parameters;
    protected final ServletContext context;
    protected String name;

    public ServletConfigImpl(final Map<String, String> parameters, final ServletContext context) {
        this.parameters = Objects.requireNonNull(parameters);
        this.context = Objects.requireNonNull(context);
    }

    public String getServletName() {
        return name;
    }

    public ServletContext getServletContext() {
        return context;
    }

    public String getInitParameter(String s) {
        return parameters.get(s);
    }

    public Enumeration getInitParameterNames() {
        Enumeration<String> e = new Enumeration<String>() {
            @Override
            public boolean hasMoreElements() {
                return parameters.keySet().iterator().hasNext();
            }
            @Override
            public String nextElement() {
                return parameters.keySet().iterator().next();
            }
        };

        return e;
    }
}
