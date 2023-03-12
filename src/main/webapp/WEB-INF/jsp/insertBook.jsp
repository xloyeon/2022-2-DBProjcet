<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>새로운 도서 등록</title>
</header>
<body>
<p>새로운 도서를 등록하려면, isbn과 title, year, price, author's name, author's address, publisher's name, stock's code, stock's num을 입력하세요.</p>
<form name="insertBookForm" method="post" action="/book/insertresult">
    <h4>도서 정보 입력</h4>
    <p>ISBN: <input type = "text" name="isbn"></p>
    <p>TITLE: <input type = "text" name="title"></p>
    <p>YEAR: <input type = "text" name="year"></p>
    <p>PRICE: <input type = "text" name="price"></p>
    <br>
    <h4>저자 정보 입력</h4>
    <p>AUTHOR'S NAME: <input type = "text" name="wname"></p
    <p>AUTHOR'S ADDRESS: <input type = "text" name="waddress"></p>
    <p>AUTHOR'S URL: <input type = "text" name="wurl"></p>
    <br>
    <h4>출판사 정보 입력</h4>
    <p>PUBLISHER'S NAME: <input type = "text" name="pname"></p>
    <p>PUBLISHER'S ADDRESS: <input type = "text" name="paddress"></p>
    <p>PUBLISHER'S PHONE: <input type = "text" name="pphone"></p>
    <p>PUBLISHER'S URL: <input type = "text" name="purl"></p>
    <br>
    <h4>창고 정보 입력</h4>
    <p>WAREHOUSE'S CODE: <input type = "text" name="code"></p>
    <p>WAREHOUSE'S ADDRESS: <input type = "text" name="address"></p>
    <p>WAREHOUSE'S PHONE: <input type = "text" name="phone"></p>
    <p>STOCK'S NUM: <input type = "text" name="num"></p>
    <p><input type="submit" name ="Submit" value="INSERT"></p>
</form>
</body>
