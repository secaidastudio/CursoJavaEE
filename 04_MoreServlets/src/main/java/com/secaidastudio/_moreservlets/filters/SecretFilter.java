package com.secaidastudio._moreservlets.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oscar
 */
@WebFilter("/secret/hello")
public class SecretFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void doFilter(ServletRequest request, 
            ServletResponse response, FilterChain chain) 
            throws IOException, ServletException {
        
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String password = httpRequest.getHeader("pass");
        if (password !=null && password.equals("hola123")) {
            chain.doFilter(request, response);
        } else {
            ((HttpServletResponse) response).sendRedirect(httpRequest.getContextPath()+"/bye");
            ((HttpServletResponse) response).setStatus(401);
        }
        
    }

    @Override
    public void destroy() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
