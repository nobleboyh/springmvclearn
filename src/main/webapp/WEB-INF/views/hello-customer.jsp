<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 9/20/2022
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello customer</title>
</head>
<body>
  <h1>Hello customer ${customer.firstName} ${customer.lastName}</h1>
<div>Your free passes: ${customer.freePasses}</div>
<div>Your course code: ${customer.course}</div>
</body>
</html>
