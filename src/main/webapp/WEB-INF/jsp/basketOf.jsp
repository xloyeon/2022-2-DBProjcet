<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Basket_of table</title>
</header>
<body>
<h2>Hello! Basket_of</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">EMAIL</td>
        <td width="100">BASKETID</td>
    </tr>
    <c:forEach items="${basketOf}" var = "basketOf">
        <tr>
            <td width="100">${basketOf.getEmail()}</td>
            <td width="100">${basketOf.getBasketid()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>