package com.secaidastudio._moreservlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author oscar
 */
@WebServlet("/secret/hello")
public class SecretServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, 
            HttpServletResponse resp) 
            throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter()){
            out.append("<html>");
            out.append("<h1>Bienvenido!!!</h1>");
            out.append("</html>");
        }
    }
    
}
