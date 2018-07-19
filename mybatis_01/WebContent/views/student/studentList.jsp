<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>전체 학생 출력</title>
</head>
<body>
<c:forEach items = "${List}" var ="s">
학생 번호 : ${s.studentNo}<br>
학생 이름 : ${s.studentName}<br>
학생 전화번호 : ${s.studentTel}<br>
학생 이메일 : ${s.studentEmail}<br>
학생 주소 : ${s.studentAddr}<br>
<hr>
</c:forEach><!-- c:forEach 는 붙여서 쓰기 -->
</body>
</html>