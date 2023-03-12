<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>작가별 도서의 총 개수, 최고, 최저, 평균 가격을 확인</title>
</header>
<body>
<h2>작가별 도서의 총 개수, 최고, 최저, 평균 가격</h2>

<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">BOOKCOUNT</td>
        <td width="100">MINPRICE</td>
        <td width="100">MAXPRICE</td>
        <td width="100">AVGPRICE</td>

    </tr>
    <c:forEach items="${count}" var = "count">
        <tr>
            <td width="100">${count.getName()}</td>
            <td width="100">${count.getBookCount()}</td>
            <td width="100">${count.getMin()}</td>
            <td width="100">${count.getMax()}</td>
            <td width="100">${count.getAvg()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>