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

    <form id="fm">
        用户名：<input type="text" name="username" id="uname"><hr>
        密码：<input type="password" name="password" id="psd"><hr>
        <input type="button" value="登录" id="button">

    </form>
    如果你还没有账号，请点击这里，注册一个新账号<a href="resign">注册</a>
    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script>
        $(function () {
                $("#button").click(function () {
                    var fm=$("#fm").serialize();
                    $.ajax({
                        url:"doLogin",
                        type:"post",
                        data:fm,
                        success:function (data) {
                            if(data =="0"){
                                alert("登录成功");
                                window.location.href="list"
                            }
                            if (data =="1"){
                                alert("密码错误，请从新输入");
                                window.location.href="login"
                            }
                            if (data == "2"){
                                alert("用户不存在，请注册");
                                window.location.href="resign"
                            }
                        }
                    })
                })

        })
    </script>

</body>
</html>
