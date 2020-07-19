<%--
  Created by IntelliJ IDEA.
  User: 15582
  Date: 2020/7/19
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>this is Springmvc demo page</title>
</head>
<body>
    <c:forEach items="${users}" var="user">
        <c:out value="${user.username}"/><br/>
        <c:out value="${user.age}"/><br/>
    </c:forEach>
</body>
</html>
