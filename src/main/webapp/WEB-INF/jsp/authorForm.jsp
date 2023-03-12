<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Search Author's book</title>
</header>
<body>
<p>Insert Author's name to find author's book</p>
<form name="authorForm" method="post" action="/writtenby/author">
    <p>SNAME: <input type = "text" name="name"></p>
    <p>ADDRESS: <input type = "text" name="address"></p>
    <p><input type="submit" name ="Submit" value="SEARCH"></p>
</form>
</body>
</html>