<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>

<head>

	<title>students-page</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	
		<div id="heading">	
			<h2>Students List</h2>
		</div>
	
		<input type="submit" value="Add Student"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="save" />
		<br>
		<br>		   		   
	<table>
	
		<tr>
			<th>First name</th>
			<th>Last name</th>
			<th>Email</th>
			<th>Age</th>
			<th>Gender</th>
			<th>Actions</th>
		</tr>
		
		<c:forEach var="tempStudent" items="${students}">
		
		<c:url var="updateLink" value="/student/showFormForUpdate">
					<c:param name="studentId" value="${tempStudent.id}"></c:param>
				</c:url>
		<c:url var="deleteLink" value="/student/delete">
					<c:param name="studentId" value="${tempStudent.id}"></c:param>
				</c:url>
		<tr>
			<td>${tempStudent.firstName}</td>
			<td>${tempStudent.lastName}</td>
			<td>${tempStudent.email}</td>
			<td>${tempStudent.age}</td>
			<td>${tempStudent.gender}</td>
			<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you want to delete this student?')))return false">Delete</a>
			</td>
		</tr>
		
		</c:forEach>
	
	</table>
</body>

</html>