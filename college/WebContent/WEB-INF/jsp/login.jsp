<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>


<form:form action="login" modelAttribute="studentBo" method="post">

Email:<form:input path="email"/><br><br>

Password:<form:input path="password"/><br><br>


<form:button value="login">Login</form:button><br><br>
<!-- <a href="profile">Profile</a>
 --></form:form>

${message}

</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>