<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Publisher table</title>
</header>
<body>
<h2>Hello! Publisher</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
        <td width="100">URL</td>
    </tr>
    <c:forEach items="${publishers}" var = "publishers">
        <tr>
            <td width="100">${publishers.getName()}</td>
            <td width="100">${publishers.getAddress()}</td>
            <td width="100">${publishers.getPhone()}</td>
            <td width="100">${publishers.getUrl()}</td>
        </tr>
    </c:forEach>
</table>

<form name="publisherForm" method="post" action="/publisher/searchbook">
    <p>NAME: <input type = "text" name="name"></p>
    <p><input type="submit" name ="Submit" value="SEARCH"></p>
</form>
</body>
</html>