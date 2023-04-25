
package MySource;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RD_Servlet1 extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
          response.setContentType("text/html;charset=UTF-8");
          
          String u=request.getParameter("username");
          String p=request.getParameter("password");
           RequestDispatcher rd;
           
          if(u.equals("admin") && p.equals("pass123"))
          {
             rd=request.getRequestDispatcher("RD_Servlet2");
             rd.forward(request, response);
          }
          else
          {
              PrintWriter out = response.getWriter();
               out.println("<h3>Invalid Username or Password. Login failed!</h3>");
               rd=request.getRequestDispatcher("/LoginPage_RD.html");
               rd.include(request, response);
          }
               
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
