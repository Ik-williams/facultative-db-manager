<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>

<head>

	<title>lecturers-page</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	
		<div id="heading">	
			<h2>Lecturers List</h2>
		</div>
	
		<input type="submit" value="Add Lecturer"
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
		
		<c:forEach var="tempLecturer" items="${lecturers}">
		
		<c:url var="updateLink" value="/lecturer/showFormForUpdate">
					<c:param name="lecturerId" value="${tempLecturer.id}"></c:param>
				</c:url>
		<c:url var="deleteLink" value="/lecturer/delete">
					<c:param name="lecturerId" value="${tempLecturer.id}"></c:param>
				</c:url>
		<tr>
			<td>${tempLecturer.firstName}</td>
			<td>${tempLecturer.lastName}</td>
			<td>${tempLecturer.email}</td>
			<td>${tempLecturer.age}</td>
			<td>${tempLecturer.gender}</td>
			<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you want to delete this lecturer?')))return false">Delete</a>
			</td>
		</tr>
		
		</c:forEach>
	
	</table>
	<br><br>
	
	<a href="${pageContext.request.contextPath}/student/showStudents" class="zone">students page</a>
	//////////
	<a href="${pageContext.request.contextPath}/score/showScores" class="zone">Scores page</a>
	
</body>

</html>