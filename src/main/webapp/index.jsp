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

<a href="account/findAll">测试查询所有用户</a>
<a href="inAContract/findAll">测试入库</a>
<a href="outAContract/findAll">测试出库</a>
<h3>测试包</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    密码：<input type="text" name="password" /><br/>
    <input type="submit" value="添加"/><br/>
</form>

<form action="account/delete" method="post">
    id：<input type="text" name="id" /><br/>
    <input type="submit" value="删除"/><br/>
</form>

<form action="account/update" method="post">
    id：<input type="text" name="id" /><br/>
    密码：<input type="text" name="password" /><br/>
    <input type="submit" value="修改"/><br/>
</form>

</body>
</html>
