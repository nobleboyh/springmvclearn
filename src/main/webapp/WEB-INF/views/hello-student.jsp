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
</body>
</html>
