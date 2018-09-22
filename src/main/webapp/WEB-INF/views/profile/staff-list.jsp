<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>EMPLOYEE</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>
<h1>EMPLOYEES</h1>
<table width="100%" cellspacing="10" cellpadding="10" border="1" style="...">
    <tr>
        <th colspan="9" align="center">
            EMPLOYEES
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="200" nowrap="nowrap" align="left">ID</th>
        <th width="300" nowrap="nowrap" align="center">FIRST NAME</th>
        <th width="300" nowrap="nowrap" align="center">LAST NAME</th>
        <th width="300" nowrap="nowrap" align="center">DATE ADD</th>
        <th width="300" nowrap="nowrap" align="center">DEPARTMENT</th>
        <th width="80" nowrap="nowrap" align="center">VIEW</th>
        <th width="80" nowrap="nowrap" align="center">EDIT</th>
        <th width="80" nowrap="nowrap" align="center">REMOVE</th>
    </tr>
    <c:forEach var="staff" items="${staffs}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index+1}</td>
            <td align="left" nowrap="nowrap">${staff.id}</td>
            <td align="center" nowrap="nowrap">${staff.firstName}</td>
            <td align="center" nowrap="nowrap">${staff.lastName}</td>
            <td align="center" nowrap="nowrap">${staff.dateAddStaff}</td>
            <td align="center" nowrap="nowrap">${staff.department.departmentName}</td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/staff-view/${staff.id}">VIEW</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/staff-edit/${staff.id}">EDIT</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/staff-delete/${staff.id}">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
<table width = 100% cellspacing="0" cellpadding="0" border="0">
    <tr>
        <td nowrap="nowrap">
            <form action="/profile/staff-create">
                <button type="submit" class="green">ADD A NEW EMPLOYEE</button>
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
</body>
</html>
