<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>재고가 ${counts}부수 이상 넘어가는 도서에 ${discounts}% 할인을 적용함.</title>
</header>
<body>
<h2>재고가 ${counts}부수 이상 넘어가는 도서에 ${discounts}% 할인을 적용하였습니다.</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">SUM</td>
        <td width="100">PRICE</td>
    </tr>
    <c:forEach items="${books}" var = "books">
        <tr>
            <td width="100">${books.getIsbn()}</td>
            <td width="100">${books.getSum()}</td>
            <td width="100">${books.getPrice()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
