<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>RESULTS</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>
<h1>RESULTS OF STAFF</h1>
<table width="100%" cellspacing="10" cellpadding="10" border="1" style="...">
    <tr>
        <th colspan="10" align="center">
            RESULTS
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="200" nowrap="nowrap" align="left">ID</th>
        <th width="200" nowrap="nowrap" align="center">EMPLOYEE</th>
        <th width="200" nowrap="nowrap" align="left">TEST</th>
        <th width="200" nowrap="nowrap" align="center">BALL OF RESULT</th>
        <th width="200" nowrap="nowrap" align="left">TIME OF TEST</th>
        <th width="200" nowrap="nowrap" align="center">DATE OF TEST</th>
        <th width="200" nowrap="nowrap" align="center">VALUE</th>
        <th width="80" nowrap="nowrap" align="center">VIEW</th>
        <th width="80" nowrap="nowrap" align="center">REMOVE</th>
    </tr>
    <c:forEach var="result" items="${results}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index+1}</td>
            <td align="left" nowrap="nowrap">${result.id}</td>
            <td align="center" nowrap="nowrap">${result.staff.firstName + " " + result.staff.lastName}</td>
            <td align="center" nowrap="nowrap">${result.test.testName}</td>
            <td align="center" nowrap="nowrap">${result.ballResult}</td>
            <td align="center" nowrap="nowrap">${result.timeResult}</td>
            <td align="center" nowrap="nowrap">${result.dateTest}</td>
            <td align="center" nowrap="nowrap">${result.result}</td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-view/${result.id}">VIEW</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-delete/${result.id}">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
<table width = 100% cellspacing="0" cellpadding="0" border="0">
    <tr>
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

