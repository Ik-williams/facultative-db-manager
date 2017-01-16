<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>

<head>

	<title>lecturer form</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	
	<form:form action="saveLecturer" modelAttribute='lecturer' method='Post'>
			
			<form:hidden path="id" />
			
			<table class="myForm">
				<tbody>
					<tr>
						<td><label>First name:</label></td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td><label>Last name:</label></td>
						<td><form:input path="lastName" /></td>
					</tr>	
					<tr>
						<td><label>Email:</label></td>
						<td><form:input path="email" /></td>
					</tr>
					<tr>
						<td><label>age:</label></td>
						<td><form:input path="age" /></td>
					</tr>
					<tr>
						<td><label>Gender:</label></td>
						<td><label>Male</label><form:radiobutton 
										path="gender" value="Male" />
										<label>Female</label><form:radiobutton 
										path="gender" value="Female" /></td>
						
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="save" class="save" /></td>
					</tr>		
				</tbody>
			</table>
		
		</form:form>
		<br><br>
			<p>
				<a href="${pageContext.request.contextPath}/lecturer/showLecturers" class="zone">Back</a>
			</p>
</body>

</html>