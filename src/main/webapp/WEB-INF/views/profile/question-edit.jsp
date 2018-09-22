<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>QUESTION</title>
</head>
<body>

<jsp:include page="../helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>

<h1>QUESTION</h1>

<form:form method="POST" action="/profile/question-save" modelAttribute="question">
    <p>
    <div style="...">TEXT OF QUESTION</div>
    <form:input path="questionText" />
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>

