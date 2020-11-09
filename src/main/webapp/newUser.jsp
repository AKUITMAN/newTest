<%--
  Created by IntelliJ IDEA.
  User: 彼南山的四夕
  Date: 2020/11/9
  Time: 21:55
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
<form action="/add" method="post">
    <input type="hidden" name="action" value="/updata">
    <input type="hidden" name="id" value="${users.id}">
    姓名：<input type="text" id="name" name="usename" value=""><br>
    性别：<input type="text" id="gender" name="usegender" value=""><br>
    邮箱：<input type="text" id="email" name="usemail" value=""><br>
    <input type="submit" value="提交">



</form>


</body>
</html>
