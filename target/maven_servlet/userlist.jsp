<%--
  Created by IntelliJ IDEA.
  User: 彼南山的四夕
  Date: 2020/11/9
  Time: 11:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!--使用el表达式 是否当作字符串来进行处理-->
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>name</th>
            <th>gender</th>
            <th>email</th>
            <th>操作</th>
        </tr>
        <c:forEach var="users" items="${list}">
            <tr>
                <td>${users.id}</td>
                <td>${users.name}</td>
                <td>${users.gender}</td>
                <td>${users.email}</td>
                <td>
                    <a href="">修改</a>|
                    <a href="">删除</a>

                </td>
            </tr>

        </c:forEach>
    </table>
</div>

</body>
</html>
