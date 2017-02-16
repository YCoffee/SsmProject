<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<form method="post" action="user/login">
    用户名：<input name="username" type="text"><br/>
    密码：<input name="password" type="password"> <br/>
    <input name="Submits" type="submit" value="登录"/>
    <input name="ReSet" type="reset" value="重置"/>
    <a href="regist.jsp"><input type="button" value="注册"/></a>
</form>
</body>
</html>
