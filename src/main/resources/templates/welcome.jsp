<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
</head>
<body>

<h1>Spring Boot Web JSP Example</h1>
			<h2>Message: ${message}</h2>
<table>
<c:forEach items="${periodicaltexts}" var="periodicaltext">
   <tr>
   <td>${periodicaltext.page_number}</td>
   <td>${periodicaltext.prayer_text}</td>
   </tr>
</c:forEach>
</table>
</body>


</html>