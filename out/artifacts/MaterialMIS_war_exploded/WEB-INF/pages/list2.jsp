<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有的账户</h2>
<c:forEach items="${list}" var="contract">
    ${contract.name}
</c:forEach>
</body>
</html>
