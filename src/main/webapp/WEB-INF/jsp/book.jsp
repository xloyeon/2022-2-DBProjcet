<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Book table</title>
</header>
<body>
<h2>Hello! Book</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">TITLE</td>
        <td width="100">YEAR</td>
        <td width="100">PRICE</td>
    </tr>
    <c:forEach items="${books}" var = "books">
        <tr>
            <td width="100">${books.getIsbn()}</td>
            <td width="100">${books.getTitle()}</td>
            <td width="100">${books.getYear()}</td>
            <td width="100">${books.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>