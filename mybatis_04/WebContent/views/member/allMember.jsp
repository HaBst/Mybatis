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
<c:forEach items = "${memberList}" var = "member">
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


<hr>
이름 또는 ID 또는 주소로 검색하기
<form action="/searchList" method = "get">
<input type = "radio" name = "select" checked value = "name"/>이름으로 검색
<input type = "radio" name = "select" value = "id"/>ID로 검색
<input type = "radio" name = "select" value = "addr">주소
<br>
입력 : <input type = "text" name = "keyword"/>
<input type = "submit" value = "검색"/>
</form>

 

<hr>
선택하여 출력 (번호, ID, 가입일은 기본적으로 보임)
<form action = "/searchCategory" method = "get">
<input type= "checkbox" name = "addr" value = "이름"/>이름
<input type= "checkbox" name = "addr" value = "주소"/>주소
<input type= "checkbox" name = "addr" value = "성별"/>성별
<input type= "checkbox" name = "addr" value = "취미"/>취미

<input type= "submit" value = "검색"/>
</form>


<hr>
지역별로 출력
<form action = "/locationCategory" method = "get">
<input type= "checkbox" name = "location" value = "서울시"/>서울
<input type= "checkbox" name = "location" value = "경기도"/>경기
<input type= "checkbox" name = "location" value = "인천광역시"/>인천
<input type= "checkbox" name = "location" value = "강원도"/>강원
<input type= "checkbox" name = "location" value = "전라도"/>전라
<input type= "checkbox" name = "location" value = "충청도"/>충청
<input type= "checkbox" name = "location" value = "경상도"/>경상
<input type= "checkbox" name = "location" value = "제주도"/>제주

<input type= "submit" value = "검색"/>
</form>



</body>
</html>