<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Incorrect Enroll table</title>
</header>
<body>
<h2>Check Incorrect Grade of Exam</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">SNAME</td>
        <td width="100">SNO</td>
        <td width="100">CNO</td>
    </tr>
    <c:forEach items="${incorrect}" var = "incorrect">
        <tr>
            <td width="100">${incorrect.getSname()}</td>
            <td width="100">${incorrect.getSno()}</td>
            <td width="100">${incorrect.getCno()}</td>
        </tr>
    </c:forEach>
</table>

<form name="incorrectGradeForm" method="post" action="/enroll/update">
    <p><input type="submit" name ="Submit" value="수정요청하기"></p>
</form>
</body>
</html>