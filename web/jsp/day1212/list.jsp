<%@ page import="java.util.List" %>
<%@ page import="neuedu.test.day1213.pojo.Product" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13 0013
  Time: 18:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <style>
        table{
            border: black 1px solid;
            border-collapse: collapse;
            margin: auto;
        }
       thead tr th,tbody tr td {
            border:black 1px solid;
            padding: 2px;
        }
        tbody tr:nth-child(odd){
            background-color: green;
        }

    </style>
</head>
<body>

    <table>

        <thead>
            <tr>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品价格</th>
                <th>删除</th>
                <th>修改</th>
            </tr>
        </thead>
        <tbody>

        <c:forEach items="${list}" var="P">
            <tr>
                <td>${P.id}</td>
                <td>${P.productName}</td>
                <td>${P.price}</td>
                <td><a href="delete?id=${P.id}">删除</a> </td>
                <td><a href="update?id=${P.id}">修改</a> </td>
            </tr>
        </c:forEach>

<%--老方法--%>
       <%--
        <%
            List<Product> list=(List<Product>)request.getAttribute("list");
            for (Product p:list
            ) { %>
               <tr>
                   <td><%=p.getId()%></td>
                   <td><%=p.getProductName()%></td>
                   <td><%=p.getPrice()%></td
               </tr>

          <% }
        %>
--%>
        </tbody>
    </table>

</body>
</html>
