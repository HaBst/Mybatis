<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원정보</title>
</head>
<body>
<c:if test="${memberInfo != null}">
<form action = "/memberUpdate" method ="post">
ID : ${memberInfo.memberId}<br>
PW : <input type = "password" name = "password" value = "${memberInfo.memberPw}"><br>  
PW_re : <input type = "password" name = "passwordRe" value = "${memberInfo.memberPw}"><br>
이름 : ${memberInfo.memberName}<br>
지역 : ${memberInfo.memberAddr}<br>
성별 : 
<c:if test = "${memberInfo.gender.equals('남')}">
<input type = "radio" name = "gender" value = "M" checked="checked">남성 <input type = "radio" name ="gender" value = "F" disabled>여성<br>
</c:if>
<c:if test = "${memberInfo.gender.equals('여')}">
<input type = "radio" name = "gender" value = "M" disabled>남성 <input type = "radio" name ="gender" value = "F" checked="checked">여성<br>
</c:if>
취미 : ${memberInfo.hobby}<br>
가입일 : ${memberInfo.regDate}<br>
<input type = "submit" value = "변경하기">
</form>
</c:if>
</body>
</html>