<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/12 0012
  Time: 12:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="dologin" method="post">
        用户名：<input type="text" name="username"><hr>
        密码：<input type="password" name="password"><hr>
        <input type="submit" name="登录">

    </form>
    如果你还没有账号，请点击这里，注册一个新账号<a href="resign">注册</a>
</body>
</html>
