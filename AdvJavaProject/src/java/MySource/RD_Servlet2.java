/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MySource;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dvoc-09
 */
public class RD_Servlet2 extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         
        String u=request.getParameter("username");
         
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RD_Servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome " + u + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

   

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
