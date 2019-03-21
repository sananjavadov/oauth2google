<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td {
  border: 1px solid grey;
  border-collapse: collapse;
}
th, td {
  padding: 5PX;
  text-align: CENTER;    
}
</style>
</head>
<body>
<center>

<table style="width:30%">
  <tr>

    <th colspan="3"><img src="${user.picture}" alt="Profile photo" style="width:75px;height:75px;"></th>
  </tr>
  <tr>
    <td>E-mail</td>
    <td>${user.mail}</td>

  </tr>
    <tr>
    <td>Adı</td>
    <td>${user.name}</td>

  </tr>

    <tr>
    <td>Soy adı</td>
    <td>${user.surname}</td>

  </tr> 
      <tr>
   <th colspan="3"><a href="/logout">Çıxış</a></th>


  </tr> 
  
</table>



</center>
</body>
</html>