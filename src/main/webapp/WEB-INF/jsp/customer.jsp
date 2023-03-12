<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Customer table</title>
</header>
<body>
<h2>Hello! Customer</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">EMAIL</td>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
    </tr>
    <c:forEach items="${customers}" var = "customers">
        <tr>
            <td width="100">${customers.getEmail()}</td>
            <td width="100">${customers.getName()}</td>
            <td width="100">${customers.getAddress()}</td>
            <td width="100">${customers.getPhone()}</td>
        </tr>
    </c:forEach>
</table>

<form name="customerForm" method="post" action="/customer/searchbook">
    <p>EMAIL: <input type = "text" name="email"></p>
    <p><input type="submit" name ="Submit" value="SEARCH"></p>
</form>
</body>
</html>