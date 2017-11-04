package com.jeopardy.servlets;

import com.jeopardy.servlets.*;
import com.jeopardy.beans.ClientBean;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       ClientBean cb = new ClientBean();
        String n1 = request.getParameter("name");
        cb.setName(n1);
        cb.setScore(0);
        
       HttpSession session = request.getSession();       
      session.setAttribute("userName",cb);
      
                     
        RequestDispatcher view = request.getRequestDispatcher("Gameboard.jsp");
        view.forward(request,response);
        
    }
    
}