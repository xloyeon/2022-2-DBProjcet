<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result of Student's course</title>
</header>
<body>
<h2>Result of Student's course</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CNAME</td>
        <td width="100">CREDIT</td>
        <td width="100">SESSIONS</td>
    </tr>
    <c:forEach items="${matched}" var = "matched">
        <tr>
            <td width="100">${matched.getCname()}</td>
            <td width="100">${matched.getCredit()}</td>
            <td width="100">${matched.getSessions()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>