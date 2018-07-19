<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>유저 리스트</title>
</head>
<body>
<c:forEach items = "${list}" var = "u">
ID : ${u.userId}<br>
PWD : ${u.userPwd}<br>
NICK : ${u.userNick}<br>
TEL : ${u.userTel}<br>
REG_DATE : ${u.regDate}<br>
<hr>
</c:forEach> 

</body>
</html>