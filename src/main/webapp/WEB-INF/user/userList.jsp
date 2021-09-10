<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户列表页面</title>
</head>
<body>
<table width="80%" border="1" align="center" cellspacing="0">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>出生日期</td>
        <td>性别</td>
    </tr>
    <c:forEach items="${users}" var="user">
        <tr>
            <td>${user.id }</td>
            <td>${user.name }</td>
            <td>${user.age }</td>
            <td><fmt:formatDate value="${user.birthday}" type="date"></fmt:formatDate></td>
            <td>${user.sex }</td>
        </tr>
    </c:forEach>
</table>
<p width="80%" align="center">
    <a href="${pageContext.request.contextPath}/user/browsePageUser?page=1&pageSize=2">第一页</a>
    <a href="${pageContext.request.contextPath}/user/browsePageUser?page=${page.page>1?page.page-1:1}&pageSize=2">上一页</a>
    <a href="${pageContext.request.contextPath}/user/browsePageUser?page=${page.page<2?page.page+1: 2}&pageSize=2">下一页</a>
    <a href="${pageContext.request.contextPath}/user/browsePageUser?page=2&pageSize=2">最后一页</a>
</p>
</body>
</html>
