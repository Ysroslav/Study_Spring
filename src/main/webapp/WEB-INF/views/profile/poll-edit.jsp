<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>TEST</title>
</head>
<body>

<jsp:include page="../helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>

<h1>TEST</h1>

<form:form method="POST" action="/profile/poll-save" modelAttribute="poll">
    <p>
    <div style="...">NAME TEST</div>
    <form:input path="testName" />
    </p>
    <p>
    <div style="...">DATE OF CREATING TEST</div>
    <form:input path="dateCreateTest" />
    </p>
    <p>
    <div style="...">MIN VALUE BALL</div>
    <form:input path="minValueBall" />
    </p>
    <p>
    <div style="...">TIME FOR TEST</div>
    <form:input path="timeTest" />
    </p>
    <p>
    <div style="...">TYPE OF TEST</div>
    <form:input path="type." />
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>
