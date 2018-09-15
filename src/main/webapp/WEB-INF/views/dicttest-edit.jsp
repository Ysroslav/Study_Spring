<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>EDIT</title>
</head>
<body>

<jsp:include page="prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>

<h1>СПРАВОЧНИК ТЕСТОВ</h1>

<form:form method="POST" action="/dicttest-save" modelAttribute="dictTestEnt">
    <p>
        <div style="...">NAME TYPE</div>
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>
