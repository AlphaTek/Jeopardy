<%-- 
    Document   : Gameboard
    Created on : 2-Oct-2017, 10:10:37 AM
    Author     : Wasif
--%>


          


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import="com.jeopardy.beans.*" %>
<!DOCTYPE HTML>
<html>
  <head>

  	<link href="https://fonts.googleapis.com/css?family=Acme" rel="stylesheet">
   <title> Jeopardy Gameboard </title>
   <meta charset="utf-8">
    <style> 

        body {
            background-image: url("sky.jpg");
            background-repeat: no-repeat;
            background-attachment: fixed;
            background-size: cover;
            font-family: 'Acme', sans-serif;
        }


        h2 {
            color: #EEE;
        }
        th {
            height: 50px;
            font-size: 25px;
            color: #EEE;
            background: #081354;  
        }

        td {
            width: 150px;
            height: 60px;
        }

        button {
            width:150px;
            height: 60px;
            font-size: 30px;
            font-weight: bold;
            color: #FFA925;    			
            background: #081354; 
            border-radius: 5px; 	

        }

        button:hover {
            background: #4C7AFE;
        }
        
        #end {
            width: 200px;
            height: 70px;
        }        
     
        input {
            width:150px;
            height: 60px;
            font-size: 30px;
            font-weight: bold;
            color: #FFA925;    			
            background: #081354; 
            border-radius: 5px; 

        }

        input:hover {
            background: #4C7AFE;
        }

    </style>
  <body>

      <% ClientBean cb = (ClientBean) session.getAttribute("userName");%>

      <h2>Name: <%= cb.getName()%> </h2>
      <h2>Score: <%= cb.getScore()%> </h2> <br>

      <form action="Questions">
          
        
          <table align="center" border="1" width="500" height="350">
              <thead>
                  <tr>

                      <th>Movies</th>

                      <th>Technology</th>

                      <th>Sheridan</th>

                      <th>Automobile</th>

                      <th>World</th>

                  </tr>		
              </thead>
              <tbody>
          
                  <tr>
                      <td> <button name="question" value="m1" ${m1} > 100 </button>
                      </td>
                      <td> <button name="question" value="t1" ${t1} > 100 </button>
                      </td>
                      <td> <button name="question" value="s1" ${s1} > 100 </button>
                      </td>
                      <td> <button name="question" value="a1" ${a1} > 100 </button>
                      </td>
                      <td> <button name="question" value="w1" ${w1} > 100 </button>
                      </td>
                  </tr>

                  <tr>
                      <td> <button name="question" value="m2" ${m2} > 200 </button>
                      </td>
                      <td> <button name="question" value="t2" ${t2} > 200 </button>
                      </td>
                      <td> <button name="question" value="s2" ${s2} > 200 </button>
                      </td>
                      <td> <button name="question" value="a2" ${a2} > 200 </button>
                      </td>
                      <td> <button name="question" value="w2" ${w2} > 200 </button>
                      </td>
                  </tr>

                  <tr>
                      <td> <button name="question" value="m3" ${m3} > 300 </button>
                      </td>
                      <td> <button name="question" value="t3" ${t3} > 300 </button>
                      </td>
                      <td> <button name="question" value="s3" ${s3} > 300 </button>
                      </td>
                      <td> <button name="question" value="a3" ${a3} > 300 </button>
                      </td>
                      <td> <button name="question" value="w3" ${w3} > 300 </button>
                      </td>
                  </tr>

                  <tr>
                      <td> <button name="question" value="m4" ${m4} > 400 </button>
                      </td>
                      <td> <button name="question" value="t4" ${t4} > 400 </button>
                      </td>
                      <td> <button name="question" value="s4" ${s4} > 400 </button>
                      </td>
                      <td> <button name="question" value="a4" ${a4} > 400 </button>
                      </td>
                      <td> <button name="question" value="w4" ${w4} > 400 </button>
                      </td>
                  </tr>

                  <tr>
                      <td> <button name="question" value="m5" ${m5} > 500 </button>
                      </td>
                      <td> <button name="question" value="t5" ${t5} > 500 </button>
                      </td>
                      <td> <button name="question" value="s5" ${s5} > 500 </button>
                      </td>
                      <td> <button name="question" value="a5" ${a5} > 500 </button>
                      </td>
                      <td> <button name="question" value="w5" ${w5} > 500 </button>
                      </td>
                  </tr>

              </tbody>

          </table>

      </form>
                      
            <form action = "congrats.jsp">
                <center>
                    <button id="end" name="end" value="end"  > End Game </button>
                </center>
            </form>
      <br>
  </body>

</head>

</html>
