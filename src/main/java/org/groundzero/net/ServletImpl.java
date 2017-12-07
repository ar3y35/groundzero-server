package org.groundzero.net;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Albert Reyes
 */
public class ServletImpl implements Servlet {
    protected ServletConfig config;
    protected String info;

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service");
    }

    public String getServletInfo() {
        return info;
    }

    public void destroy() {
        System.out.println("destroy");
    }
}
