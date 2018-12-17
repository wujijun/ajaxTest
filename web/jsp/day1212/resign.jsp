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
    <style>
       form{
           width: 400px;
           height: auto;
           border: black 1px solid;
           padding: auto;
           margin: auto;
           background-color: aqua;
       }
        div{
            width: 400px;
            height: auto;
            border: black 1px solid;
            top: 100px;
            margin:auto;
            background-color: coral;
        }
    </style>
</head>
<body>

    <form >
        用户名：<input type="text" name="username" id="uname"><span id="message"></span><br>
        登录密码：<input type="password" name="password"><br>
        确认密码：<input type="password" name="password1"><br>
        电子邮箱： <input type="email" name="email"><br>
        注册：<input type="button" name="注册" id="button" style="width: 100px">
    </form>
    <div>
        注册成功，请登录：<a href="login">登录</a>
    </div>

    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script>


 /*注册--判断账户是否重复*/
         var un ;
         $("#uname").keyup(function () {
             un =  $("#uname").val();

             $.ajax({
                 url:"doRegister",
                 type:"get",
                 data:{"unames":un},
                 success:function (result) {
                    if (result == "1"){
                        $("#message").text("sorry,you canot use this name!")
                    } else {
                        $("#message").text("you can resign with this name!")
                    }
                 }
             });
         })

        $("#button").click(function () {


        })

     })


    </script>
</body>
</html>
