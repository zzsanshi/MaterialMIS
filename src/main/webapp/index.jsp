<%--
  Created by IntelliJ IDEA.
  User: zzsanshi
  Date: 2021/5/11
  Time: 17:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<a href="account/findAll">测试查询</a>
<a href="outAContract/findAll">测试查询2</a>
<a href="inAContract/findAll">测试查询3</a>
<h3>测试包</h3>

<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>

</body>
</html>
