package org.groundzero.net;

import javax.servlet.*;
import javax.servlet.descriptor.JspConfigDescriptor;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.EventListener;
import java.util.Map;
import java.util.Set;

/**
 * @author Albert Reyes
 */
public class ServletContextImpl implements ServletContext {
    protected String contextPath;
    protected int majorVersion;
    protected int minorVersion;
    protected int effectiveMajorVersion;
    protected int effectiveMinorVersion;
    protected String serverInfo;
    protected String contextName;
    protected Map<String, Object> attributes;


    public String getContextPath() {
        return null;
    }

    public ServletContext getContext(String s) {
        return null;
    }

    public int getMajorVersion() {
        return majorVersion;
    }

    public int getMinorVersion() {
        return minorVersion;
    }

    public int getEffectiveMajorVersion() {
        return effectiveMajorVersion;
    }

    public int getEffectiveMinorVersion() {
        return effectiveMinorVersion;
    }

    public String getMimeType(String s) {
        return null;
    }

    public Set<String> getResourcePaths(String s) {
        return null;
    }

    public URL getResource(String s) throws MalformedURLException {
        return null;
    }

    public InputStream getResourceAsStream(String s) {
        return null;
    }

    public RequestDispatcher getRequestDispatcher(String s) {
        return null;
    }

    public RequestDispatcher getNamedDispatcher(String s) {
        return null;
    }

    @Deprecated
    public Servlet getServlet(String s) throws ServletException {
        throw new UnsupportedOperationException("Method getServlet(String s) is deprecated as of Servlet API 2.1");
    }

    @Deprecated
    public Enumeration<Servlet> getServlets() {
        throw new UnsupportedOperationException("Method getServlets() is deprecated as of Servlet API 2.1");
    }

    @Deprecated
    public Enumeration<String> getServletNames() {
        throw new UnsupportedOperationException("Method getServletNames() is deprecated as of Servlet API 2.1");
    }

    public void log(String s) {

    }

    public void log(Exception e, String s) {

    }

    public void log(String s, Throwable throwable) {

    }

    public String getRealPath(String s) {
        return null;
    }

    public String getServerInfo() {
        return serverInfo;
    }

    public String getInitParameter(String s) {
        return null;
    }

    public Enumeration<String> getInitParameterNames() {
        return null;
    }

    public boolean setInitParameter(String s, String s1) {
        return false;
    }

    public Object getAttribute(String s) {
        return attributes.get(s);
    }

    public Enumeration<String> getAttributeNames() {
        return null;
    }

    public void setAttribute(String s, Object o) {
        attributes.put(s, o);
    }

    public void removeAttribute(String s) {
        attributes.remove(s);
    }

    public String getServletContextName() {
        return contextName;
    }

    public ServletRegistration.Dynamic addServlet(String s, String s1) {
        return null;
    }

    public ServletRegistration.Dynamic addServlet(String s, Servlet servlet) {
        return null;
    }

    public ServletRegistration.Dynamic addServlet(String s, Class<? extends Servlet> aClass) {
        return null;
    }

    public ServletRegistration.Dynamic addJspFile(String s, String s1) {
        return null;
    }

    public <T extends Servlet> T createServlet(Class<T> aClass) throws ServletException {
        return null;
    }

    public ServletRegistration getServletRegistration(String s) {
        return null;
    }

    public Map<String, ? extends ServletRegistration> getServletRegistrations() {
        return null;
    }

    public FilterRegistration.Dynamic addFilter(String s, String s1) {
        return null;
    }

    public FilterRegistration.Dynamic addFilter(String s, Filter filter) {
        return null;
    }

    public FilterRegistration.Dynamic addFilter(String s, Class<? extends Filter> aClass) {
        return null;
    }

    public <T extends Filter> T createFilter(Class<T> aClass) throws ServletException {
        return null;
    }

    public FilterRegistration getFilterRegistration(String s) {
        return null;
    }

    public Map<String, ? extends FilterRegistration> getFilterRegistrations() {
        return null;
    }

    public SessionCookieConfig getSessionCookieConfig() {
        return null;
    }

    public void setSessionTrackingModes(Set<SessionTrackingMode> set) {

    }

    public Set<SessionTrackingMode> getDefaultSessionTrackingModes() {
        return null;
    }

    public Set<SessionTrackingMode> getEffectiveSessionTrackingModes() {
        return null;
    }

    public void addListener(String s) {

    }

    public <T extends EventListener> void addListener(T t) {

    }

    public void addListener(Class<? extends EventListener> aClass) {

    }

    public <T extends EventListener> T createListener(Class<T> aClass) throws ServletException {
        return null;
    }

    public JspConfigDescriptor getJspConfigDescriptor() {
        return null;
    }

    public ClassLoader getClassLoader() {
        return null;
    }

    public void declareRoles(String... strings) {

    }

    public String getVirtualServerName() {
        return null;
    }

    public int getSessionTimeout() {
        return 0;
    }

    public void setSessionTimeout(int i) {

    }

    public String getRequestCharacterEncoding() {
        return null;
    }

    public void setRequestCharacterEncoding(String s) {

    }

    public String getResponseCharacterEncoding() {
        return null;
    }

    public void setResponseCharacterEncoding(String s) {

    }
}
