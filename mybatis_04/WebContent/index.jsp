<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${session == null}">
회원 로그인
<form action = "/login" method = "post">
ID : <input type = "text" name = "userId"/><br>
PW : <input type = "text" name = "userPwd"/><br>
<input type = "submit" value = "로그인"/><br>
</form>
<a href = "/views/member/enroll.jsp">회원가입</a>
</c:if>

<c:if test="${session != null}">
<h3>[${session.memberName}] 님 환영합니다.</h3>
<a href = "/logout">로그아웃</a><br>
<a href = "/myPage">마이 정보 보기</a><br>
<a href = "/delete">회원 탈퇴</a><br>
<c:if test="${session.memberId == 'admin'}">
<a href = "/memberList">전체 회원 조회</a>
</c:if>
</c:if>


</body>
</html>