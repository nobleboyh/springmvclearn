<%--
  Created by IntelliJ IDEA.
  User: tcvsmacmini2021
  Date: 19/09/2022
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
  <title>Customer Input Form</title>
  <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resource/style.css"/>
</head>
<body>
<form:form modelAttribute="customer" action="process-form" cssClass="form-info">
  <h2>Customer Info</h2>
  <label for="first-name">First name: </label>
  <form:input id="first-name" path="firstName"/>
  <form:errors path="firstName" cssClass="error"/>
  <label for="last-name">Last name: </label>
  <form:input id="last-name" path="lastName"/>
  <form:errors path="lastName" cssClass="error"/>
  <label for="free-passes">Free passes: </label>
  <form:input id="free-passes" path="freePasses"/>
  <form:errors path="freePasses" cssClass="error"/>
  <form:button type="submit">Submit</form:button>
</form:form>
</body>
</html>
