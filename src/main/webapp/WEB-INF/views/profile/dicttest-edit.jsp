<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>EDIT</title>
</head>
<body>

<jsp:include page="../helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>

<h1>GROUP</h1>

<form:form method="POST" action="/profile/dicttest-save" modelAttribute="dictTestEnt">
    <p>
        <div style="...">NAME TYPE</div>
        <form:input path="nameType" />
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>
