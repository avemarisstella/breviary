<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Brewiarz</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
</head>
<body>
<p>Hello</p>


<p th:each="periodicaltext : ${periodicaltexts}">
<h4>Page Number:</h4>
<div th:text="${periodicaltext.page_number}"></div>
<div th:text="${periodicaltext.prayer_text}"></div>
<%${periodicaltext.prayer_text}%>

<div>---------------------------------------------------------</div>
</p>
</body>
</html>