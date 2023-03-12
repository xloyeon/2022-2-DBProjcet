<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Author table</title>
</header>
<body>
<h2>Hello! Author</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">URL</td>
    </tr>
    <c:forEach items="${authors}" var = "authors">
        <tr>
            <td width="100">${authors.getName()}</td>
            <td width="100">${authors.getAddress()}</td>
            <td width="100">${authors.getUrl()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>