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

<form:form method="POST" action="/profile/staff-save" modelAttribute="staff">
    <p>
    <div style="...">FIRST NAME</div>
    <form:input path="firstName" />
    </p>
    <p>
    <div style="...">LAST NAME</div>
    <form:input path="lastName" />
    </p>
    <p>
    <div style="...">DATE ADD STAFF</div>
    <form:input path="dateAddStaff" />
    </p>
    <p>
    <div style="...">DEPARTMENT</div>
    <form:input path="department" />
    </p>
    <p>
        <button type = "submit">SAVE</button>
    </p>
</form:form>

</body>
</html>

