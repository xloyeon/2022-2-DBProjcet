<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Professor table</title>
</header>
<body>
<h2>Hello! Professors</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">PNO</td>
        <td width="100">PNAME</td>
        <td width="100">PMAJOR</td>
        <td width="100">PDEPT</td>
    </tr>
    <c:forEach items="${professors}" var = "professors">
        <tr>
            <td width="100">${professors.getPno()}</td>
            <td width="100">${professors.getPname()}</td>
            <td width="100">${professors.getPmajor()}</td>
            <td width="100">${professors.getPdept()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>