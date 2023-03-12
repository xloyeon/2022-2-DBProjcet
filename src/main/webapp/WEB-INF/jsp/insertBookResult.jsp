<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib prefix="c" uri ="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang = "ko">
<header>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>새로운 도서 등록 완료</title>
</header>
<body>
<h2>새로운 도서를 등록하여 다음의 정보들이 업데이트 되었습니다.</h2>

<h4>Book table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">TITLE</td>
        <td width="100">YEAR</td>
        <td width="100">PRICE</td>
    </tr>
    <tr>
        <td width="100">${books.getIsbn()}</td>
        <td width="100">${books.getTitle()}</td>
        <td width="100">${books.getYear()}</td>
        <td width="100">${books.getPrice()}</td>
    </tr>
</table>
<br>
<br>
<h4>Written_By table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">ISBN</td>
    </tr>
    <tr>
        <td width="100">${writtens.getName()}</td>
        <td width="100">${writtens.getAddress()}</td>
        <td width="100">${writtens.getIsbn()}</td>
    </tr>

</table>
<br>
<br>
<h4>Author table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">URL</td>
    </tr>
    <tr>
        <td width="100">${authors.getName()}</td>
        <td width="100">${authors.getAddress()}</td>
        <td width="100">${authors.getUrl()}</td>
    </tr>
</table>
<br>
<br>
<h4>Published_by table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ISBN</td>
    </tr>
    <tr>
        <td width="100">${publisheds.getName()}</td>
        <td width="100">${publisheds.getIsbn()}</td>
    </tr>
</table>
<br>
<br>
<h4>Publisher table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">NAME</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
        <td width="100">URL</td>
    </tr>
    <tr>
        <td width="100">${publishers.getName()}</td>
        <td width="100">${publishers.getAddress()}</td>
        <td width="100">${publishers.getPhone()}</td>
        <td width="100">${publishers.getUrl()}</td>
    </tr>
</table>
<br>
<br>
<h4>Warehouse table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">CODE</td>
        <td width="100">ADDRESS</td>
        <td width="100">PHONE</td>
    </tr>
    <tr>
        <td width="100">${warehouses.getCode()}</td>
        <td width="100">${warehouses.getAddress()}</td>
        <td width="100">${warehouses.getPhone()}</td>
    </tr>
</table>
<br>
<br>
<h4>Stocks table</h4>
<table width="500" border="1">
    <th></th>
    <tr>
        <td width="100">ISBN</td>
        <td width="100">CODE</td>
        <td width="100">NUM</td>
    </tr>
    <tr>
        <td width="100">${stocks.getIsbn()}</td>
        <td width="100">${stocks.getCode()}</td>
        <td width="100">${stocks.getNum()}</td>
    </tr>
</table>
</body>
</html>
