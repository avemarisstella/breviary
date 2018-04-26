<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
</head>
<body>

<h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2>
<c:forEach items="${periodicaltexts}" var="periodicaltext">
   <c:out value="${periodicaltext.page_number}"/>
   <c:out value="${periodicaltext.prayer_text}"/>
</c:forEach>

</body>


</html>