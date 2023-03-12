<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Result of Customer's book</title>
</header>
<body>
<h2>Result of Customer's book</h2>

<table width="400" border="1">
    <th></th>
    <tr>
        <td width="100">EMAIL</td>
        <td width="100">ISBN</td>
        <td width="100">PUBLISHER</td>
        <td width="100">AUTHOR</td>
    </tr>
    <c:forEach items="${book}" var = "book">
        <tr>
            <td width="100">${book.getEmail()}</td>
            <td width="100">${book.getIsbn()}</td>
            <td width="100">${book.getPublisher()}</td>
            <td width="100">${book.getAuthor()}</td>
        </tr>
    </c:forEach>
</table>
</body>
