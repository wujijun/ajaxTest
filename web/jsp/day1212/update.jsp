<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/13 0013
  Time: 22:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <form action="doUpdate">
        <input type="text" name="id" hidden="hidden" value="${p.id}"><br>
      商品名称：<input type="text" name="productName" value="${p.productName}"><br>
      商品价格：<input type="text" name="price" value="${p.price}"><br>
      <input type="submit" value="修改">
  </form>

</body>
</html>
