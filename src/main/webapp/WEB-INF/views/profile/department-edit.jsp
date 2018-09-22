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

<h1>DEPARTMENT</h1>

<form:form method="POST" action="/profile/department-save" modelAttribute="department">
    <p>
    <div style="...">NAME DEPARTMENT</div>
    <form:input path="departmentName" />
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>
