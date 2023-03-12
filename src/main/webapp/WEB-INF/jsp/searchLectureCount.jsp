<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Table of lecture counts by department</title>
</header>
<body>
<h2>Lecture counts by department</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">DEPT</td>
        <td width="100">COUNT_LECTURE</td>
    </tr>
    <c:forEach items="${count}" var = "count">
        <tr>
            <td width="100">${count.getDept()}</td>
            <td width="100">${count.getCountLecture()}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>