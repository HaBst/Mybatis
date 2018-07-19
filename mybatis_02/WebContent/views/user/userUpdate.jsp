<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "/userUpdate">
Id : <input type = "text" name = "userId" value = "${user.userId}" readonly="readonly"><br>
Pwd : <input type = "text" name = "userPwd" value = "${user.userPwd}"><br>
Nick : <input type = "text" name = "userNick" value = "${user.userNick}"><br>
Tel : <input type = "text" name = "userTel" value = "${user.userTel}"><br>
RegDate : <input type = "text" value = "${user.regDate}" readonly="readonly"><br>
<input type = "submit" value = "변경">
</form>

</body>
</html>