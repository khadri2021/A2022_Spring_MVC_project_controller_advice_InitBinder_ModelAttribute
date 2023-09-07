<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<body>

	<div align="center">
		Register Form Data
		<hr>
		Name : ${registerForm.name}  <br>
		Age : ${registerForm.age} <br>
		DOB : ${registerForm.date} <br>
		PACKAGE : ${registerForm.ctc}  

	</div>


</body>
</html>
