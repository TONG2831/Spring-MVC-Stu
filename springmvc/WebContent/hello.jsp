<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
<br>
<!-- views -->
<a href="views/test">Test Views</a>
<br><br>
	<!-- ModelAttributes -->
	<form method="post" action="modelattribute/test">
		userId:<input type="text" name="userId" /> <br> 
		sname:<input type="text" name="username" /><br> 
		<br> <input type="submit" value="测试ModelAttributes">
	</form>
	<br>
	<br>
	<!-- @SessionAttributes -->
	<a href="sessionAttributes/test">Test SessionAttributes</a>
	<br>
	<br>
	
	<!-- Map处理模型shuju -->
	<a href="map/test">Test Map</a>
	<br>
	<br>
	
	<!-- ModelAndView -->
	<a href="mdoelandview/test">Test ModelAndView</a>
	<br>
	<br>

	<!-- POJO address必须和Student中的address相同-->
	<form method="post" action="pojo/test">
		sno:<input type="text" name="sno" /> <br> sname:<input
			type="text" name="sname" /><br> city:<input type="text"
			name="address.city"><br> province:<input type="text"
			name="address.province"> <br> <input type="submit"
			value="测试POJO">
	</form>
	<br>

	<!-- @cookievalue -->
	<a href="cookievalue/test">Test@cookievalue</a>
	<br>

	<!-- @RequestHeader -->
	<a href="requestheader/test">Test@RequestHeader</a>
	<br>

	<!-- @RequestParam -->
	<a href="requestparam/test?username='张三'&age=1">Test@RequestParam</a>
	<br>
	<form method="post" action="requestparam/test">
		<input type="hidden" name="username" value='李四' /> <input
			type="hidden" name="age" value="13" /> <input type="submit"
			value="测试@RequestParam的POST">
	</form>
	<br>

	<!-- Hello SpringMVC -->
	<a href="helloworld">Hello World!</a>
	<br>
	<br>
	<br>
	<!--  -->
	<a href="springmvc/test?sname=2">Spring MVC Test!!</a>

</body>
</html>