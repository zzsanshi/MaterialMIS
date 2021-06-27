<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path;
%>
<html>
<head>
        <title>Title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
<h2>表单</h2>
<form action="/upload" method="post" enctype="multipart/form-data">
       
        profile image:<input type="file" name="image"/><br/>
        <input type="submit" value="提交"/>
</form>
</body>
</html>