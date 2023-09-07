<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<body>
   
   <div align="center">
      Register Form
      <hr> 
      <form:form action="register" modelAttribute="registerForm" method="post">
      	Name : <form:input path="name"/> <form:errors path="name"/>
      	Age  : <form:input path="age"/>
      	DOB  : <form:input  path="date"/>
      	Package : <form:input path="ctc"/>
      	<input type="submit" value="Register">
      </form:form>
   </div>
   
   
</body>
</html>
