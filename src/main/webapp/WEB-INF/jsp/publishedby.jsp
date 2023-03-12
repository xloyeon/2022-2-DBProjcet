<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Published_by table</title>
</header>
<body>
<h2>Hello! Publishedby</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ISBN</td>
    </tr>
    <c:forEach items="${publisheds}" var = "publisheds">
        <tr>
            <td width="100">${publisheds.getName()}</td>
            <td width="100">${publisheds.getIsbn()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>