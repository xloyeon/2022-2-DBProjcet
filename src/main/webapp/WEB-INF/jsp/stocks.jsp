<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Stocks table</title>
</header>
<body>
<h2>Hello! Stocks</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">CODE</td>
        <td width="100">NUM</td>
    </tr>
    <c:forEach items="${stocks}" var = "stocks">
        <tr>
            <td width="100">${stocks.getIsbn()}</td>
            <td width="100">${stocks.getCode()}</td>
            <td width="100">${stocks.getNum()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>