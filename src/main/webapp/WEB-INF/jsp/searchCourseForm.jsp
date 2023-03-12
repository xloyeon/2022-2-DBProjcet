<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Student's Course</title>
</header>
<body>
<p>Insert a Student Number to find course</p>
<form name="searchForm" method="post" action="/enroll">
    <p>SNO: <input type = "number" name="sno"></p>
    <p><input type="submit" name ="Submit" value="SEARCH"></p>
</form>
</body>
</html>