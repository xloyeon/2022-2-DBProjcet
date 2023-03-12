<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Updated Enroll Table</title>
</header>
<body>
<p>Successfully updated incorrect data to ENROLL table! </p>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">SNO</td>
        <td width="100">CNO</td>
        <td width="100">GRADE</td>
        <td width="100">EXAM</td>
    </tr>
    <c:forEach items="${modify}" var = "modify">
        <tr>
            <td width="100">${modify.getSno()}</td>
            <td width="100">${modify.getCno()}</td>
            <td width="100">${modify.getGrade()}</td>
            <td width="100">${modify.getExam()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>