<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Course table</title>
</header>
<body>
<h2>Hello! Courses</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">CNAME</td>
        <td width="100">CREDIT</td>
        <td width="100">SESSIONS</td>
    </tr>
    <c:forEach items="${courses}" var = "courses">
        <tr>
            <td width="100">${courses.getCno()}</td>
            <td width="100">${courses.getCname()}</td>
            <td width="100">${courses.getCredit()}</td>
            <td width="100">${courses.getSessions()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>