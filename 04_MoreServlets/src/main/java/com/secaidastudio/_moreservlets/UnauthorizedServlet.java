package com.secaidastudio._moreservlets;

import com.sun.net.httpserver.HttpServer;
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
@WebServlet("/bye")
public class UnauthorizedServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, 
            HttpServletResponse resp) 
            throws ServletException, IOException {
        resp.setStatus(403);
        try(PrintWriter out = resp.getWriter()){
            out.append("<html>");
            out.append("<h1>acceso no autorizado</h1>");
            out.append("</html>");
        }
    }
}
