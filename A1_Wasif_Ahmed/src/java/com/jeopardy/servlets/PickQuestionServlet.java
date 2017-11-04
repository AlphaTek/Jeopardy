package com.jeopardy.servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import com.jeopardy.beans.*;
import com.jeopardy.logic.SelectQuestion;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


/**
 *
 * @author Wasif
 */

public class PickQuestionServlet extends HttpServlet {
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
        HttpSession session = request.getSession(); 
       
        String qMov = request.getParameter("question");      
        
        SelectQuestion sq = new SelectQuestion();
        Question que = sq.loadQuestions(qMov);  
        
        session.setAttribute("pick", que);

              String s1 = "hidden";              
          if (qMov.equals(qMov) == true) {
              session.setAttribute(qMov,s1); 
          }    
          
          RequestDispatcher view = request.getRequestDispatcher("Question.jsp");
        view.forward(request,response);
        
    }
    
}
    
