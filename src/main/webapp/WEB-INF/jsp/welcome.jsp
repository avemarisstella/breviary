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
<%
String from = (String) pageContext.getAttribute("${periodicaltext.prayer_text}");
String to = from.replaceAll("\r\n", "<br />");
pageContext.setAttribute("to", to);
%>

   <tr>
   <td>${periodicaltext.page_number}</td>
  <td><c:out value="${to}" escapeXml="false" /></td>
   </tr>
</c:forEach>
</table>
</body>


</html>