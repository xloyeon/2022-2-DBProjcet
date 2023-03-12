<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table of student counts by dept, year</title>
</header>
<body>
<h2>Student counts by dept</h2>

<table width="200" border="1">
    <th></th>
    <tr>
        <td width="100">DEPT</td>
        <td width="100">COUNT_STUDENT</td>
    </tr>
    <c:forEach items="${dept}" var = "dept">
        <tr>
            <td width="100">${dept.getDept()}</td>
            <td width="100">${dept.getCountStudent()}</td>
        </tr>
    </c:forEach>
</table>

<hr>

<h2>Student counts by year</h2>

<table width="200" border="1">
    <th></th>
    <tr>
        <td width="100">YEAR</td>
        <td width="100">COUNT_STUDENT</td>
    </tr>
    <c:forEach items="${year}" var = "year">
        <tr>
            <td width="100">${year.getYear()}</td>
            <td width="100">${year.getCountStudent()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>