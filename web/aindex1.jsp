<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/11 0011
  Time: 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        html body{
            background-color: azure;
        }
        div{
            width: 100px;
            height: 100px;
            background-color: greenyellow;
        }
    </style>
</head>
<body>

    <div>
        <% ;
            System.out.println(request.getAttribute("key"));
            System.out.println(session.getAttribute("session"));
             System.out.println(application.getAttribute("ser"));
    %>

    </div>


   <%-- <% x=3; %>
    <% int x=5; %>
    <%! int x=7; %>
    x = <%=x%>, <%=this.x%>--%>

  <%--  <% for ( int i = 0 ; i < 3 ; i ++){ %>
    out.print( i * 2);
    <% } %>--%>

</body>
</html>
