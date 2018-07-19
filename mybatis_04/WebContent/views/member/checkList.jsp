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


<table border="1">
<tr><th>번호</th><th>ID</th><th>이름</th><th>지역</th><th>성별</th><th>취미</th><th>가입일</th></tr>
<c:forEach items = "${list}" var = "member">
<tr>
<td>${member.memberNo}</td>
<td>${member.memberId}</td>
<td>${member.memberName}</td>
<td>${member.memberAddr}</td>
<td>${member.gender}</td>
<td>${member.hobby}</td>
<td>${member.regDate}</td>
</tr>
</c:forEach>
</table>


</body>
</html>