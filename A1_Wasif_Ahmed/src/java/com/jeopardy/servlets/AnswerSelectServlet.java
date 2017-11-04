package com.jeopardy.servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jeopardy.beans.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 *
 * @author Wasif
 */

public class AnswerSelectServlet extends HttpServlet {

        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
         
    
        HttpSession session = request.getSession();
        ClientBean cb = (ClientBean)request.getSession(false).getAttribute("userName");
        String answer = request.getParameter("answer");
       
        Question que = (Question) session.getAttribute("pick");       
        String test =  que.getCorrect();
        
         int score = Integer.parseInt(que.getValue());
         
         String skip = "skip";
        
         
      if (test.equals(answer) == true ) {
             score += cb.getScore();
             cb.setScore(score);
          
         
      } else if ((test.equals(answer) == false) && (answer.equals(skip) == false) ) {         
      
          score = cb.getScore() - score;
          cb.setScore(score);
          
            RequestDispatcher view = request.getRequestDispatcher("oops.jsp");
            view.forward(request,response);
        
      } else if (answer.equals(skip) == true ) {             
                 cb.getScore();         
         } 
      
       RequestDispatcher view = request.getRequestDispatcher("Gameboard.jsp");
        view.forward(request,response);
        
    }
    
}