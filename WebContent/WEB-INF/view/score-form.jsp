<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>

<head>

	<title>score form</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	
	<form:form action="saveScore" modelAttribute='score' method='Post'>
			
			<form:hidden path="id" />
			
			<table>
				<tbody>
					<tr>
						<td><label>Score:</label></td>
						<td><form:input path="score" /></td>
					</tr>
					<tr>
						<td><label>max-score:</label></td>
						<td><form:input path="maxScore" /></td>
					</tr>	
					<tr>
						<td><label>min-score:</label></td>
						<td><form:input path="minScore" /></td>
					</tr>
					<tr>
						<td><label></label></td>
						<td><input type="submit" value="save" class="save" /></td>
					</tr>		
				</tbody>
			</table>
		
		</form:form>

</body>

</html>