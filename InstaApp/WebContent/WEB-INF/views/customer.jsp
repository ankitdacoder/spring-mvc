<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="postRegister" modelAttribute="customer">
First Name : <form:input path="firstName"/><br><br>
Last Name(*):  <form:input path="lastName"/>
 <form:errors path="lastName"/>
<br><br>	
<input type="submit" value="Submit"/>
</form:form>

</body>
</html>