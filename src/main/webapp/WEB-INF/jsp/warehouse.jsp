<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Warehouse table</title>
</header>
<body>
<h2>Hello! Warehouse</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CODE</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
    </tr>
    <c:forEach items="${warehouses}" var = "warehouses">
        <tr>
            <td width="100">${warehouses.getCode()}</td>
            <td width="100">${warehouses.getAddress()}</td>
            <td width="100">${warehouses.getPhone()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>