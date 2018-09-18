<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Admin Panel</title>
    <jsp:include page="prefix.jsp"/>
</head>
<body>

<table width="320" cellspacing="0" cellpadding="0" border="1" style="...">
    <tr>
        <th class = "myt" colspan="8" align="center">
            TESTS
        </th>
    </tr>
    <tr>
        <th width="60" nowrap="nowrap" align="center">№</th>
        <th width="200" nowrap="nowrap" align="left">TEST</th>
        <th width="10" nowrap="nowrap" align="center">STAFFS</th>
        <th width="10" nowrap="nowrap" align="center">STAFFS SUCCESS</th>
        <th width="10" nowrap="nowrap" align="center">AVG BALL</th>
        <th width="10" nowrap="nowrap" align="center">MAX BALL</th>
        <th width="10" nowrap="nowrap" align="center">MIN BALL</th>
        <th width="10" nowrap="nowrap" align="center">LAST TRAIN</th>
    </tr>
    <c:forEach var="statisticalTest" items="${statisticalTests}" varStatus="status">
        <tr>
            <td align="center" nowrap="nowrap">${status.index+1}</td>
            <td align="left" nowrap="nowrap">${statisticalTest.testStaff.testName}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.amountStaff}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.amountStaffSuccess}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.avgBall}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.maxBall}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.minBall}</td>
            <td align="center" nowrap="nowrap">${statisticalTest.lastTest}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
