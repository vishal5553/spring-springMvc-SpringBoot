<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
.error{
    color: red
}
</style>
</head>
<body>
<h3>Registration Form</h3>


<form:form action= "register" modelAttribute= "user" method= "POST">
<table>
<tr> 
 <td>userName</td>
 <td><form:input path ="uname"/>
     <form:errors path = "uname"  cssClass= "error"/> </td> 
</tr>

<tr> 
 <td>Pwd</td>
 <td><form:password path ="pwd"/>
     <form:errors path = "pwd"  cssClass= "error"/></td> 
</tr>

<tr> 
 <td>Email</td>
 <td><form:input path ="email"/>
     <form:errors path = "email"  cssClass= "error"/></td> 
</tr>

<tr> 
 <td>Pno</td>
 <td><form:input path ="pno"/>
     <form:errors path = "pno"  cssClass= "error"/></td> 
</tr>

<tr> 
 <td>Age</td>
 <td><form:input path ="age"/>
     <form:errors path = "age"  cssClass= "error"/></td> 
</tr>


<tr> 
<td> </td>
 <td> <input type="submit" value="Register" /> </td>
</tr>

</form:form>

</table>

</body>
</html>