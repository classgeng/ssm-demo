<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
</head>
<body>
<a href="${ctx}/toSave">新增</a>
<table>
    <tr>
        <td>ID</td><td>姓名</td><td>账号</td><td>操作</td>
    </tr>
    <c:forEach var="item" items="${userInfos}">
    <tr>
        <td>${item.id}</td>
        <td>${item.name}</td>
        <td>${item.account}</td>
        <td><a href="${ctx}/select/${item.id}">编辑</a></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>
