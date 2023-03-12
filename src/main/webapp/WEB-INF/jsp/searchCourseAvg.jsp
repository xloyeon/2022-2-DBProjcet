<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table of Average of scores by course and student counts by grade</title>
</header>
<body>
<h2>Average of scores by course</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">AVG_EXAM</td>
    </tr>
    <c:forEach items="${courseAvg}" var = "courseAvg">
        <tr>
            <td width="100">${courseAvg.getCno()}</td>
            <td width="100">${courseAvg.getAvgExam()}</td>
        </tr>
    </c:forEach>
</table>
<br>
<hr>
<h2>student counts by course, grade</h2>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">GRADE</td>
        <td width="100">COUNT_STUDENT</td>
    </tr>
    <c:forEach items="${counts}" var = "counts">
        <tr>
            <td width="100">${counts.getCno()}</td>
            <td width="100">${counts.getGrade()}</td>
            <td width="100">${counts.getCountStudent()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>