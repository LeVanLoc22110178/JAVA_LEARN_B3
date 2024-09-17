<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quên mật khẩu</title>
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
            text-align: center;
        }

        h2 {
            margin-top: 0;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 8px;
            text-align: left;
        }

        input[type="email"], input[type="password"] {
            width: calc(100% - 22px);
            padding: 10px;
            margin-bottom: 16px;
            border: 1px solid #ddd;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
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
        <h2>Forgot Password?</h2>
        <form action="Forgot" method="post">
            <label for="email">Enter email:</label>
            <input type="email" id="email" name="email" required>
            
            <label for="password">Enter new password:</label>
            <input type="password" id="password" name="password" required>
            
            <input type="submit" value="Change Password">
        </form>
        <div class="register-link">
			<a href="login.jsp">Login here</a>
		</div>
    </div>
</body>
</html>
