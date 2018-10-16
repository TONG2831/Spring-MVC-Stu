<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<br>
	<br>
	request,student:${requestScope.stu}<br>
	session,student:${sessionScope.stu }<br>
	request:${requestScope.str}
	session:${sessionScope.str}
	<br>
	<br>
	<br> 
	names:${name}
	<br>
	<br>

	<h4>SUCCESS!</h4>

	time:${time}
	<br> time:${requestScope.time }



</body>
</html>