import java.io.IOException;

import javax.faces.application.ResourceHandler;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter(filterName = "AuthFilter", urlPatterns = { "/secure/home.xhtml", "/faces/*" })
public class AuthFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
            FilterChain chain) throws IOException, ServletException {
        try {
            System.out.println("doFilter ...");
            HttpServletRequest request = (HttpServletRequest) req;
            HttpServletResponse response = (HttpServletResponse) res;
            HttpSession session = request.getSession(false);
            String user = (session != null) ? (String)session.getAttribute("username") : null;
            String loginURL = request.getContextPath() + "/login.xhtml";
            boolean loginRequest = request.getRequestURI().startsWith(loginURL);
            boolean resourceRequest = request.getRequestURI().startsWith(request.getContextPath()+ ResourceHandler.RESOURCE_IDENTIFIER);
            if (user != null || loginRequest) {
                chain.doFilter(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/login.xhtml");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void destroy() {
        //      
    }
}