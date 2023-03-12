<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table of total credits and Average of scores by student</title>
</header>
<body>
<h2>Total credits and Average of scores by student</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">SNO</td>
        <td width="100">SUM_CREDIT</td>
        <td width="100">AVG_EXAM</td>
    </tr>
    <c:forEach items="${studentCredit}" var = "studentCredit">
        <tr>
            <td width="100">${studentCredit.getSno()}</td>
            <td width="100">${studentCredit.getSumCredit()}</td>
            <td width="100">${studentCredit.getAvgExam()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>