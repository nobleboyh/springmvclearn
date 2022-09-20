<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tcvsmacmini2021
  Date: 19/09/2022
  Time: 16:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    Hello student works: ${student.firstName} ${student.lastName}
    <br/>
    Country: ${student.countryList.get(student.country)}
<br/>
    Your language: ${student.favoriteLanguage}

<br/>
    <p>Your OS:</p>
    <ul>
        <c:forEach var="os" items="${student.operationSystems}">
            <li>${os}</li>
        </c:forEach>
    </ul>
</body>
</html>
