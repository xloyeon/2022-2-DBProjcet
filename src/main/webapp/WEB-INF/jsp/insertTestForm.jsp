<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert a Record</title>
</header>
<body>
<p>Insert a Student Data to Student Table</p>
<form name="studentForm" method="post" action="/student">
    <p>SNO: <input type = "text" name="sno"></p>
    <p>PNO: <input type="text" name="pno"></p>
    <p>SNAME: <input type="text" name="studentName"></p>
    <p>YEAR: <input type="text" name="year"></p>
    <p>DEPT: <input type="text" name="dept"></p>
    <p><input type="submit" name ="Submit" value="INSERT"></p>
</form>
</body>
</html>
