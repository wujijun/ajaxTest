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
        #message{
            color: red;
        }
    </style>
</head>
<body>

    <form >
        用户名：<input type="text" name="username" id="names" class="do"><span id="message"></span><br>
        登录密码：<input type="password" name="password" id="password" ><br>
        确认密码：<input type="password" name="password1" id="password1" class="do"><br>
        电子邮箱： <input type="email" name="email" id="email" ><br>
        注册：<input type="button" value="注册" id="button" style="width: 100px">
    </form>
    <div>
        注册成功，请登录：<a href="login">登录</a>
    </div>

    <script type="text/javascript" src="js/jquery-3.3.1.min.js"></script>
    <script>


 /*注册--判断账户是否重复*/
        $(function () {
            var un ;
            var psd;
            var psd1;
            var email;

            $(".do").blur(function () {
                un =  $("#names").val();
                psd = $("#password").val();
                psd1 = $("#password1").val();
                email = $("#email").val();

                $.ajax({
                    url:"doRegister",
                    type:"post",
                    data:{"names":un ,"password":psd , "password1":psd1 , "email":email},

                    success:function (result) {
                        if (result == "1"){
                            console.log(result);
                            $("#message").text("sorry,you cannot use this name!")
                        }
                         else if (result == "2") {
                            console.log(result);
                            $("#message").text("√")
                        }
                        if (result == "23") {
                            console.log(result);
                        }else if (result == "24") {
                            console.log(result);
                        }
                    }
                });
            });
        });




    </script>
</body>
</html>
