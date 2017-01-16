<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>

<head>

	<title>scores-page</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>

	
		<div id="heading">	
			<h2>Scores List</h2>
		</div>
	
		<input type="submit" value="Add Score"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="save" />
		<br>
		<br>		   		   
	<table>
	
		<tr>
			<th>Score</th>
			<th>Maximum-Score</th>
			<th>Minimum-Score</th>
			<th>Actions</th>
		</tr>
		
		<c:forEach var="tempScore" items="${scores}">
		
		<c:url var="updateLink" value="/score/showFormForUpdate">
					<c:param name="scoreId" value="${tempScore.id}"></c:param>
				</c:url>
		<c:url var="deleteLink" value="/score/delete">
					<c:param name="scoreId" value="${tempScore.id}"></c:param>
				</c:url>
		<tr>
			<td>${tempScore.score}</td>
			<td>${tempScore.maxScore}</td>
			<td>${tempScore.minScore}</td>
			<td>
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							onclick="if(!(confirm('Are you sure you want to delete this score?')))return false">Delete</a>
			</td>
		</tr>
		
		</c:forEach>
	
	</table>
</body>

</html>