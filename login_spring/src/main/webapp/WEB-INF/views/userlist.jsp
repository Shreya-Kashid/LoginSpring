<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>

<head>
<title>First Web Application</title>
</head>

<body>
    <table border = "1">
    		<tr>
    			<th>Name</th>
    			<th>Gender</th>
    			<th>Department</th>
    			<th>Date of Birth</th>
    			<th>Actions</th>
    		</tr>
    		<c:forEach items="${list}" var="e">
    			<tr>
    				<td>${e.getUsername()}</td>
    				<td>${e.getPassword()}</td>
    				<td>${e.getRoles()}</td>
    				<td>
    					<a href = "${pageContext.request.contextPath}/login">Edit</a>
    					|
    					<a href = "${pageContext.request.contextPath}/login">Delete</a>
    				</td>
    			</tr>
    		</c:forEach>
    	</table>
</body>

</html>