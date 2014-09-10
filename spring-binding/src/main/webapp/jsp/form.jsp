<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Form</title>
</head>
<body>
	<form:form id="formMain" modelAttribute="a" method="post" action="save">
		<div>
			<form:label path="description">Description:</form:label>
			<form:input path="description"/>
		</div>
		
		<div>
			<form:label path="b">B:</form:label>
			<form:select path="b" items="${bMap}" />
		</div>
		
		<div>  
            <c:forEach items="${cList}" var="cItem">
            	<c:choose>
  					<c:when test="${cItem.id == 0}">
  						<form:radiobutton path="c" value="${cItem.id}" checked="true"/>${cItem.description}   
  					</c:when>
					<c:otherwise>
						<form:radiobutton path="c" value="${cItem.id}" />${cItem.description}   
   					</c:otherwise>
				</c:choose>
            </c:forEach>  
        </div> 
		
		<div>
			<input id="submitButton" type="submit" value="Save" />
		</div>
	
	
	</form:form>

</body>
</html>