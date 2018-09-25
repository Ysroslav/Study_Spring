<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<jsp:include page="../helper/prefix.jsp">
    <jsp:param name="title" value="TESTS"/>
</jsp:include>
    <h1>СПРАВОЧНИК ТЕСТОВ</h1>
<table width="100%" cellspacing="10" cellpadding="10" border="1" style="...">
    <tr>
        <th colspan="7" align="center">
            TESTS
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="200" nowrap="nowrap" align="left">ID</th>
        <th width="300" nowrap="nowrap" align="center">NAME</th>
        <th width="80" nowrap="nowrap" align="center">VIEW</th>
        <th width="80" nowrap="nowrap" align="center">EDIT</th>
        <th width="80" nowrap="nowrap" align="center">REMOVE</th>
    </tr>
    <c:forEach var="dictTest" items="${dictTestEnts}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index+1}</td>
            <td align="left" nowrap="nowrap">${dictTest.id}</td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/poll-list/${dictTest.id}">${dictTest.nameType}</a></td>
            <td align="center" nowrap="nowrap">
                    <a href = "/profile/dicttest-view/${dictTest.id}">VIEW</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/dicttest-edit/${dictTest.id}">EDIT</a></td>
            <td align="center" nowrap="nowrap">
                <a href = "/profile/dicttest-delete/${dictTest.id}">REMOVE</a></td>
        </tr>
    </c:forEach>
</table>
<table width = 100% cellspacing="0" cellpadding="0" border="0">
    <tr>
        <td nowrap="nowrap">
            <form action="/profile/dicttest-create">
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
