<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Create Weblocation</title>
</head>
<body>

<form action="updateWebloc" method="post">
<pre>
Id: <input type="text" name="id" value="${weblocation.id}" readonly/>
Code: <input type="text" name="code" value="${weblocation.code}"/>
Name: <input type="text" name="name" value="${weblocation.name}"/>
Type: Urban <input type="radio" name="type" value="URBAN" ${weblocation.type=='URBAN'?'checked':''}/>
	Rural <input type="radio" name="type" value="RURAL" ${weblocation.type=='RURAL'?'checked':''}/>
Email: <input type="text" name="email" value="${weblocation.name}"/>
Phone: <input type="text" name="phone" value="${weblocation.name}"/>
Address: <input type="text" name="address" value="${weblocation.name}"/>
<input type="submit" value="save"/>
</pre>
</form>

</body>
</html>