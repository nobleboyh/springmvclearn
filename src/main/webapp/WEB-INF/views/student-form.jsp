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
    <title>Student Input Form</title>
</head>
<body>
    <form:form modelAttribute="student" action="process-form">
        <label for="first-name">First name: </label>
        <form:input id="first-name" path="firstName"/>
        <label for="last-name">Last name: </label>
        <form:input id="last-name" path="lastName"/>
        <form:select path="country">
            <form:options items="${student.countryList}"/>
        </form:select>
        <form:button type="submit">Submit</form:button>
    </form:form>
</body>
</html>
