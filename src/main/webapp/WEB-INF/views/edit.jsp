<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>编辑</title>
    <c:set var="ctx" value="${pageContext.request.contextPath}"/>
</head>
<body>
<form id="myForm" action="${ctx}/save" method="post">
    <input id="id" name="id" value="${userInfo.id}" type="hidden">
<table>
    <tr>
        <td>姓名：</td>
        <td><input id="name" name="name" value="${userInfo.name}"></td>
    </tr>
    <tr>
        <td>密码：</td>
        <td><input id="password" name="password" value="${userInfo.password}" type="password"></td>
    </tr>
    <tr>
        <td>账号：</td>
        <td><input id="account" name="account" value="${userInfo.account}"></td>
    </tr>
    <tr>
        <td>备注：</td>
        <td><input id="remark" name="remark" value="${userInfo.remark}"></td>
    </tr>
    <tr>
        <td colspan="2"><input type="submit" name="保存"></td>
    </tr>
</table>
</form>
</body>
</html>
