<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有的账户</h2>
<h3 align="left">分页查询</h3>
<!-- 数据部分 -->
<table  align="left" border="1px solid pink" style="text-align: center;font-size: 14px;margin-top:0px;" >
    <tbody>
    <tr>
        <td>用户编号</td>
        <td>用户姓名</td>
        <td>用户密码</td>
    </tr>
    <c:forEach items="${list}" var="account">
        <tr>
            <td>${account.id}</td>
            <td>${account.name}</td>
            <td>${account.password}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<br>
<!-- 分页按钮部分 -->
<p>当前是${pageInfo.pageNum}/${pageInfo.pages}</p>
<a href="/account/findAll?page=${pageInfo.firstPage}">第一页</a>
<a href="/account/findAll?page=${pageInfo.nextPage}">下一页</a>
<a href="/account/findAll?page=${pageInfo.prePage}">上一页</a>
<a href="/account/findAll?page=${pageInfo.lastPage}">最后页</a>
</body>
</html>
