<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/12 0012
  Time: 13:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="doresign" method="post">
        用户名：<input type="text" name="username"><hr>
        密码：<input type="password" name="password"><hr>
        确认密码：<input type="password" name="password1"><hr>
       电子邮箱： <input type="email" name="email"><hr>
        <input type="submit" name="注册"><hr>
    </form>
    注册成功，请登录：<a href="login">登录</a>

</body>
</html>
