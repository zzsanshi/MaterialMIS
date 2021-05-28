<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>查询所有入库</h2>
<c:forEach items="${list2}" var="contract">
    ${contract.name}
</c:forEach>
</body>
</html>
