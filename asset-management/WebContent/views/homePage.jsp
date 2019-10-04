<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="submit" method="post">
		<div class="form-group">
			<label>Email Id :</label> <input type="email"
				class="form-control" name="emplEmail">
		</div>
		<div class="form-group">
			<label>Password:</label> <input type="password"
				class="form-control" name="empPassword">
		</div>
		
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>