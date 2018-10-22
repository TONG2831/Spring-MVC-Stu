<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee</title>
</head>
<body>
	<c:if test="${list == null }">
		没有员工信息
	</c:if>
	<c:if test="${list != null }">
		<table border="1" cellpadding="10" cellspace="0">
			<tr>
				<td>ID</td>
				<td>Name</td>
				<td>Sex</td>
				<td>DepartMent</td>
				<td>操作</td>
				<td>操作</td>
			</tr>
			<c:forEach items="${list}" var="emp1">
				<tr>
					<td>${emp1.id}</td>
					<td>${emp1.name}</td>
					<td>${emp1.sex}</td>
					<td>${emp1.department}</td>
					<td><a href="edit">Edit</a></td>
					<td><a href="edit">DELETE</a></td>
				</tr>
			</c:forEach>
		</table>
	</c:if>
</body>
</html>