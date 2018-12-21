<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/resources/css/style1.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body class="log" >
  <div id="container">
<form action="j_spring_security_check" method="post">
<h1>Connexion</h1>
<table>
<tr>
<td>Login</td>
<td><input type="text" placeholder="Entrer le nom d'utilisateur" name="j_username"></td>
</tr>
<tr>
<td>Pass word</td>
<td><input type="password" placeholder="Entrer le mot de passe" name="j_password"></td>
</tr>
<tr>
<td><input type="submit" value="Login"></td>
</tr>
</table>
</form>
  </div>>
</body>
</html>