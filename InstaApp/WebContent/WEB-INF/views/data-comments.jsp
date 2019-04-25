<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Post Comments Data</title>
</head>
<body>
UserId:${param.userid}

FeedID:${param.feedid}

FeedType :${commentmodel.cType}

<c:forEach var="temp" items="${commentmodel.languages}">
<ul>
<li>${temp}</li>
</ul>
</c:forEach>  
</body>
</html>