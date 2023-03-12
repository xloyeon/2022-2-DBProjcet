<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Average Price of books</title>
</header>
<body>
<h2>Average Price of books and average price of books by year</h2>

<p>전체 도서 평균 가격: ${allAvg}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">YEAR</td>
        <td width="100">AVG_PRICE</td>
    </tr>
    <c:forEach items="${yearAvg}" var = "yearAvg">
        <tr>
            <td width="100">${yearAvg.getYear()}</td>
            <td width="100">${yearAvg.getAvgPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>