<%--
  Created by IntelliJ IDEA.
  User: demacia
  Date: 16/9/14
  Time: 下午6:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>jilinwula</title>
</head>
<body>
    <c:if test="${!empty error}">
        <font color="red"><c:out value="${error}"/></font>
    </c:if>
    <form action="<c:url value="/loginCheck.html"/>" method="post">
        用户名:
        <input type="text" name="userName"/>
        <br/>
        密&nbsp;码
        <input type="password" name="password"/>
        <br/>
        <input type="submit" value="登陆"/>
        <input type="reset" value="重置"/>
    </form>
</body>
</html>
