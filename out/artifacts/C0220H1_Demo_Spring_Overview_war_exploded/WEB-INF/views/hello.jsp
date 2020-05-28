<%--
  Created by IntelliJ IDEA.
  User: vuanh
  Date: 5/28/20
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Chi tiet HV</title>
</head>
<body>
<h1>Nhap ten vao</h1>
<form:form method="post" modelAttribute="student">
    <form:input path="name"></form:input>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
