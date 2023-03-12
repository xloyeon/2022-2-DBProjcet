<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result of Author's book</title>
</header>
<body>
<h2>Result of Author's book</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">TITLE</td>
        <td width="100">STOCK</td>
    </tr>
    <c:forEach items="${book}" var = "book">
        <tr>
            <td width="100">${book.getName()}</td>
            <td width="100">${book.getTitle()}</td>
            <td width="100">${book.getSumNum()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>