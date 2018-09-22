<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>VIEW</title>
</head>
<body>
<jsp:include page="../helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>

<h1>EMPLOYEE</h1>
<c:set var = "staff" value = "${staff}"/>
<table width="100%" cellspacing="10" cellpadding="10" border="1" style="...">
    <tr>
        <th colspan="2">
            EMPLOYEE
        </th>
    </tr>
    <tr>
        <th width="300" nowrap="nowrap" align="left">CAPTION</th>
        <th width="200" nowrap="nowrap" align="left">NAME</th>
    </tr>
    <tr>
        <td>ID</td>
        <td>${staff.id}</td>
    </tr>
    <tr>
        <td>FIRST NAME</td>
        <td>${staff.firstName}</td>
    </tr>
    <tr>
        <td>LAST NAME</td>
        <td>${staff.lastName}</td>
    </tr>
    <tr>
        <td>DATE ADD</td>
        <td>${staff.dateAddStaff}</td>
    </tr>
    <tr>
        <td>DEPARTMENT</td>
        <td>${staff.department.departmentName}</td>
    </tr>
    <table width = 100% cellspacing="0" cellpadding="0" border="0">
        <tr>
            <td nowrap="nowrap">
                <form action="/profile/staff-list">
                    <button type="submit" class="green">EMPLOYEES</button>
                </form>
            </td>
            <td width = "20" nowrap = "nowrap">&nbsp;</td>
            <td nowrap="nowrap">
                <form>
                    <input type = "hidden" name = "time" value = "<%=System.currentTimeMillis()%>"/>
                    <button type = "submit" class = "gray">REFRESH</button>
                </form>
            </td>
            <td width="100%">
                &nbsp;
            </td>
        </tr>
    </table>
</table>
</body>
</html>
