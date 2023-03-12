<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>특정 부수 이상 넘어가는 도서 검색</title>
</header>
<body>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">SUM</td>
        <td width="100">PRICE</td>
    </tr>
    <c:forEach items="${book}" var = "book">
        <tr>
            <td width="100">${book.getIsbn()}</td>
            <td width="100">${book.getSum()}</td>
            <td width="100">${book.getPrice()}</td>
        </tr>
    </c:forEach>
</table>

<p>부수와 할인율을 입력하세요.</p>
<form name="stockForm" method="post" action="/book/updateprice">
    <p>STOCK: <input type = "text" name="stock"></p>
    <p>DISCOUNT: <input type = "text" name="discount"></p>
    <p><input type="submit" name ="Submit" value="SEARCH & DISCOUNT"></p>
</form>
</body>
</html>