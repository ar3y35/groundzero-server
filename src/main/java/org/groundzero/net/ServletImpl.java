package org.groundzero.net;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author Albert Reyes
 */
public class ServletImpl implements Servlet {
    private ServletConfig config;
    private String info;

    public void init(ServletConfig servletConfig) throws ServletException {
        config = servletConfig;
        info = config.getServletName();
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
        config = null;
        info =null;
    }

}
