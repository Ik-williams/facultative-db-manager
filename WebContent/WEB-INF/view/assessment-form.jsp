<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html>

<head>

	<title>assessment form</title>
	<link type="text/css" 
		  rel="stylesheet" 
		  href="${pageContext.request.contextPath}/resources/css/style.css" />
</head>

<body>
	
	<form:form action="saveAssessment" modelAttribute='assessment' method='Post'>
			
			<form:hidden path="id" />
			
			<table class="myForm">
				<tbody>
					<tr>
						<td><label>Student Name:</label></td>
						<td><form:input path="studentFullName" /></td>
					</tr>
					<tr>
						<td><label>Lecturer Name:</label></td>
						<td><form:input path="lecturerFullName" /></td>
					</tr>	
					<tr>
						<td><label>Course:</label></td>
						<td><form:input path="courseName" /></td>
					</tr>
					<tr>
						<td><label>Score:</label></td>
						<td><form:input path="score" /></td>
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
				<a href="${pageContext.request.contextPath}/assessment/showAssessments" class="zone">Back</a>
			</p>
			<br><br>
			   <div class="wrapper">
        <div class="line line1">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line2">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line3">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line4">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line5">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line6">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line7">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line8">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line9">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line10">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
        <div class="line line11">
            <span class="circle circle-top"></span>
            <div class="dotted">
                <span class="dot dot-top"></span>
                <span class="dot dot-middle-top"></span>
                <span class="dot dot-middle-bottom"></span>
                <span class="dot dot-bottom"></span>
            </div>
            <span class="circle circle-bottom"></span>
        </div>
    </div>
</body>

</html>