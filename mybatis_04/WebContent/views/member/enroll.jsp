<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>회원 가입 정보</h2>
<form action = "/join" method ="post">
ID : <input type = "text" name = "userId"/><br>
PW : <input type = "text" name = "userPwd"/><br>
PW_re : <input type = "text" name = "userPwdRe"/><br>
이름 : <input type = "text" name = "userName"/><br>
지역 : <input type = "radio" name = "userLocation" value = "서울" checked="checked">서울<input type = "radio" name = "userLocation" value = "경기">경기
		<input type = "radio" name = "userLocation" value = "인천">인천<input type = "radio" name = "userLocation" value = "강원">강원
		<input type = "radio" name = "userLocation" value = "전라">전라<input type = "radio" name = "userLocation" value = "충청">충청
		<input type = "radio" name = "userLocation" value = "경상">경상<input type = "radio" name = "userLocation" value = "제주">제주
		<br>
성별 : <input type = "radio" name = "gender" value = "M" checked="checked">남성 <input type = "radio" name ="gender" value = "F">여성<br>
취미 : <input type = "checkbox" name = "hobby" value = "여행">여행<input type = "checkbox" name = "hobby" value = "음악감상">음악감상
		<input type = "checkbox" name = "hobby" value = "춤">춤<input type = "checkbox" name = "hobby" value = "공부">공부<br>
<input type = "submit" value = "회원가입">
</form>
</body>
</html>