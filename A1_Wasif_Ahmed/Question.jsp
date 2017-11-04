<%-- 
    Document   : Question
    Created on : 3-Oct-2017, 9:57:59 PM
    Author     : Wasif
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.jeopardy.beans.*" %>
<!DOCTYPE HTML>
<html>
    <head>
        <title> Question page </title>

        <link href="https://fonts.googleapis.com/css?family=Droid+Sans" rel="stylesheet">
        <meta charset="utf-8">
        <style>

        html { width: 100%; height:100%; overflow:hidden; }

        #container {
       position: relative; 
       margin: auto; 
       width:800px;
       height:500px;
          }

        #question {

     background: rgba(0,0,0,0.3);
     text-align: center;
        }

     body {

     background-image: url("./blue.jpg");
     background-size:auto;
     background-repeat: no-repeat;
     background-attachment: fixed;
     background-size: cover;
     font-family: 'Droid Sans', sans-serif;

     }

     #main {

       background: rgba(0,0,0,0.3);
       color: white;
       text-align: center;

     }

     h3 {
       font-size: 25px;

     }
     h4 {
       font-size: 22px;
       color:#EEE;
     }

     p{
       font-size: 20px;
       font-weight: bold;  
       color: #EEE;
     }
   
     button {
         padding: 10px;
         width:320px;
         color: rgba(0,0,0,0.5);
         background: #0098cb;
         border-radius:5px;
         border:0px;
         margin:20px auto;
         margin-top:0px;
         font-size: 20px;
         font-weight: bold;
         cursor:pointer;
     }
   
        button:hover {
        background: #00b8eb;
        }
   
        h1 {
        text-align: center;
        }
        </style>
    </head>

    <body>
        <% ClientBean cb = (ClientBean) session.getAttribute("userName"); %>
        <% Question que = (Question) session.getAttribute("pick");%> 


        <div id="container">	

            <div id="main">  		
                <h3 id="name"> Name: <%= cb.getName()%> </h3> 	
                <h3 id="score"> Score: <%= cb.getScore()%> </h3>
                <h4> Category: <%= que.getCategory()%> </h4>      
                <h4> Value: <%= que.getValue()%>  </h4>
            </div>		
            <br>
            <form action="Answers" method="Get"> 
                <div id="question">


                    <h4> Question: </h4>
                    <p> <%= que.getQuestion()%> </p>

                    <button name="answer" value="<%= que.getA1() %>"> <%= que.getA1()%> </button>
                    <button name="answer" value="<%= que.getA2() %>"> <%= que.getA2()%></button><br>
                    <button name="answer" value="<%= que.getA3() %>"> <%= que.getA3()%> </button>
                    <button name="answer" value="<%= que.getA4() %>"> <%= que.getA4()%></button><br>

                    <button name="answer" value="skip"> SKIP Question </button>
             
            </form>

        </div>
    </body> 
</html>