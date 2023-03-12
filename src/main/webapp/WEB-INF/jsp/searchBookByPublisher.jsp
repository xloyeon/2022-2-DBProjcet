<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result of Publisher's book</title>
</header>
<body>
<h2>Result of Publisher's book</h2>

<table width="400" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">TITLE</td>
        <td width="100">PRICE</td>
        <td width="100">STOCK</td>
    </tr>
    <c:forEach items="${book}" var = "book">
        <tr>
            <td width="100">${book.getName()}</td>
            <td width="100">${book.getTitle()}</td>
            <td width="100">${book.getPrice()}</td>
            <td width="100">
                <c:choose>
                    <c:when test="${book.getStock() eq 0}">"재고없음"</c:when>
                    <c:otherwise>${book.getStock()}</c:otherwise>
                </c:choose>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
