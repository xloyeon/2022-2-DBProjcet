<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Lecture table</title>
</header>
<body>
<h2>Hello! Lectures</h2>

<p>튜플 개수: ${counts}</p>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNO</td>
        <td width="100">PNO</td>
        <td width="100">LEC_TIME</td>
        <td width="100">ROOM</td>
    </tr>
    <c:forEach items="${lectures}" var = "lectures">
        <tr>
            <td width="100">${lectures.getCno()}</td>
            <td width="100">${lectures.getPno()}</td>
            <td width="100">${lectures.getLec_time()}</td>
            <td width="100">${lectures.getRoom()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>