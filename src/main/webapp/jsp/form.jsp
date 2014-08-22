<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<script type="text/javascript" src='<c:url value="/resources/js/jquery-1.11.0.js" />'></script>
	<script type="text/javascript" src='<c:url value="/resources/js/test.js" />' ></script>
	<title>Welcome!</title>
</head>
<body>
	<form:form id="form-test" action="hello/action" modelAttribute="testModel" method="post">
		<form:input path="name" /><br>
		
		<input type="submit" value="Submit" />
		
	</form:form>

</body>
</html>