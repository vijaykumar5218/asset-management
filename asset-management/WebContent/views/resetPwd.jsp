<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="resetPwd" method="post">
		<div class="form-group">
			<label>Email Id :</label> <input type="email"
				class="form-control" name="emplEmail">
		</div>
		<div class="form-group">
			<label>New Password:</label> <input type="text"
				class="form-control" name="empNewPassword">
		</div>
		
		<div class="form-group">
			<label>Confirm Password:</label> <input type="text"
				class="form-control" name="empConfirmPassword">
		</div>
		
		<button type="submit" class="btn btn-default">Reset</button>
	</form>

</body>
</html>