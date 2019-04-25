<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Comments</title>
</head>
<body>

 <form:form action="postComments" method="post" modelAttribute="commentmodel">
  
  UserId:<form:input  path="userid"/><br><br>
  FeedID:<form:input  path="feedid"/><br><br>
  Comment Type: <form:select path="cType"> 
              <form:options items="${commentmodel.commentType}"/>  
  </form:select>
  <br><br>
  <form:checkbox path="languages" value="PHP"/>
  <form:checkbox path="languages" value="JAVA"/>
  <form:checkbox path="languages" value="MYSQL"/>
  <br><br>
  <input type="submit" value="Submit"/>
 </form:form>
</body>
</html>