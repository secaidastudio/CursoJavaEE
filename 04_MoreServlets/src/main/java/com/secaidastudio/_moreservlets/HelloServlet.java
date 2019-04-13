
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
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        super.init(); 
        System.out.println("Creando el servlet HelloServlet");
    }

    @Override
    public void destroy() {
        super.destroy(); 
        System.out.println("Hasta la vida HelloServlet");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp); 
        System.out.println("Me llego una peticion de tipo "+req.getMethod());
    }

    
    
    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        try(PrintWriter out = response.getWriter()){
            out.append("<html>");
            out.append("<h1>Hola chavos!!!</h1>");
            out.append("</html>");
        }
            

    }
    
    
    
}
