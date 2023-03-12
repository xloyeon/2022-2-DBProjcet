<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Enroll table</title>
</header>
<body>
<h2>Hello! Enroll</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">SNO</td>
        <td width="100">CNO</td>
        <td width="100">GRADE</td>
        <td width="100">EXAM</td>
    </tr>
    <c:forEach items="${enrolls}" var = "enrolls">
        <tr>
            <td width="100">${enrolls.getSno()}</td>
            <td width="100">${enrolls.getCno()}</td>
            <td width="100">${enrolls.getGrade()}</td>
            <td width="100">${enrolls.getExam()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>