<%--
  Created by IntelliJ IDEA.
  User: tcvsmacmini2021
  Date: 19/09/2022
  Time: 08:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resource/style.css"/>
</head>
<body>
    <form action="process-form3" method="get">
        <label for="name">Input name: </label>
        <input id="name" name="name" type="text"/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
