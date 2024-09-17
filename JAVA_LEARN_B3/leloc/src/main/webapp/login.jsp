<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	display: flex;
	justify-content: center;
	align-items: center;
	height: 100vh;
	margin: 0;
}

.login-container {
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	width: 100%;
	max-width: 400px;
	box-sizing: border-box;
}

h2 {
	text-align: center;
	color: #333;
}

label {
	display: block;
	margin-bottom: 8px;
	color: #666;
}

input[type="text"], input[type="password"] {
	width: 100%;
	padding: 10px;
	margin-bottom: 12px;
	border: 1px solid #ddd;
	border-radius: 4px;
	box-sizing: border-box;
}

input[type="submit"] {
	width: 100%;
	padding: 10px;
	border: none;
	border-radius: 4px;
	background-color: #007bff;
	color: #fff;
	font-size: 16px;
	cursor: pointer;
}

input[type="submit"]:hover {
	background-color: #0056b3;
}

.register-link {
	display: block;
	text-align: center;
	margin-top: 10px;
}

.register-link a {
	color: #007bff;
	text-decoration: none;
}

.register-link a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="login-container">
		<h2>Login Form</h2>
		<form action="Login" method="post">
			<label for="username">Enter Username:</label> <input type="text"
				id="username" name="username" required> <label
				for="password">Enter Password:</label> <input type="password"
				id="password" name="password" required> <input type="submit"
				value="Login">
		</form>
		<div class="register-link">
			<a href="Register.jsp">Don't have an account? Register here / </a>
			<a href="Forgot.jsp">Ban quen mat khau ?</a>
		</div>
	</div>
</body>
</html>
