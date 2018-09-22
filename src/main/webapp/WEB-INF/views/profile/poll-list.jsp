<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>TESTS</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>
<h1>TESTS FOR STAFF</h1>
<table width="100%" cellspacing="10" cellpadding="10" border="1" style="...">
    <tr>
        <th colspan="10" align="center">
            ALL TESTS
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="200" nowrap="nowrap" align="left">ID</th>
        <th width="200" nowrap="nowrap" align="center">NAME</th>
        <th width="200" nowrap="nowrap" align="left">DATE CREATE</th>
        <th width="200" nowrap="nowrap" align="center">MIN BALL</th>
        <th width="200" nowrap="nowrap" align="left">TIME FOR DECISION</th>
        <th width="200" nowrap="nowrap" align="center">TYPE TEST</th>
        <th width="80" nowrap="nowrap" align="center">VIEW</th>
        <th width="80" nowrap="nowrap" align="center">EDIT</th>
        <th width="80" nowrap="nowrap" align="center">REMOVE</th>
    </tr>
    <c:forEach var="testStaff" items="${tests}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index+1}</td>
            <td align="left" nowrap="nowrap">${testStaff.id}</td>
            <td align="center" nowrap="nowrap">${testStaff.testName}</td>
            <td align="center" nowrap="nowrap">${testStaff.dateCreateTest}</td>
            <td align="center" nowrap="nowrap">${testStaff.minValueBall}</td>
            <td align="center" nowrap="nowrap">${testStaff.timeTest}</td>
            <td align="center" nowrap="nowrap">${testStaff.type.nameType}</td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-view/${testStaff.id}">VIEW</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-edit/${testStaff.id}">EDIT</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-delete/${testStaff.id}">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
<table width = 100% cellspacing="0" cellpadding="0" border="0">
    <tr>
        <td nowrap="nowrap">
            <form action="/profile/poll-create">
                <button type="submit" class="green">CREATE A NEW TEST</button>
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

