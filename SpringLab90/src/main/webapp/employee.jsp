<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Welcome to Java Learning Center</h1>
<h2 align="center"> This is EMPLOYEE Page</h2>
<h3>Welcome:${pageContext.request.userPrincipal.name}
<a href="<c:url value='/j_spring_security_logout'/>">Logout</a></h3>
</body>
</html>