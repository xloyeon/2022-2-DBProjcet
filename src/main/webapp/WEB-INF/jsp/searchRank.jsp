<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table of student Info with max or min scores</title>
</header>
<body>
<h2>Students with the highest score</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">MAX EXAM</td>
        <td width="100">SNO</td>
        <td width="100">PNO</td>
        <td width="100">SNAME</td>
        <td width="100">YEAR</td>
        <td width="100">DEPT</td>
    </tr>
    <c:forEach items="${max}" var = "max">
        <tr>
            <td width="100">${max.getCno()}</td>
            <td width="100">${max.getExam()}</td>
            <td width="100">${max.getSno()}</td>
            <td width="100">${max.getPno()}</td>
            <td width="100">${max.getSname()}</td>
            <td width="100">${max.getYear()}</td>
            <td width="100">${max.getDept()}</td>
        </tr>
    </c:forEach>
</table>

<hr>

<h2>Students with the lowest score</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">MAX EXAM</td>
        <td width="100">SNO</td>
        <td width="100">PNO</td>
        <td width="100">SNAME</td>
        <td width="100">YEAR</td>
        <td width="100">DEPT</td>
    </tr>
    <c:forEach items="${min}" var = "min">
        <tr>
            <td width="100">${min.getCno()}</td>
            <td width="100">${min.getExam()}</td>
            <td width="100">${min.getSno()}</td>
            <td width="100">${min.getPno()}</td>
            <td width="100">${min.getSname()}</td>
            <td width="100">${min.getYear()}</td>
            <td width="100">${min.getDept()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>