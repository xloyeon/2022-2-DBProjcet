<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Student table</title>
</header>
<body>
<h2>Hello! students</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">SNO</td>
        <td width="100">PNO</td>
        <td width="100">SNAME</td>
        <td width="100">YEAR</td>
        <td width="100">DEPT</td>
    </tr>
    <c:forEach items="${students}" var = "student">
        <tr>
            <td width="100">${student.getSno()}</td>
            <td width="100">${student.getPno()}</td>
            <td width="100">${student.getSname()}</td>
            <td width="100">${student.getYear()}</td>
            <td width="100">${student.getDept()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>