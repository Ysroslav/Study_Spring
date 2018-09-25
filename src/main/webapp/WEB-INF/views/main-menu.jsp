<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<table width="100%" cellpadding="10" cellspacing="10" bgcolor="black" style="...">
    <tr>
        <td width="100%">
            <a href = "/admin/index" style = "...">MAIN</a>
            <sec:authorize access="isAuthenticated()">
                &nbsp;|&nbsp;
                <a href = "/profile/dicttest-list">GROUP</a>&nbsp;|&nbsp;
                <a href = "/profile/department-list">DEPARTMENT</a>&nbsp;|&nbsp;
                <a href = "/profile/staff-list">STAFF</a>&nbsp;|&nbsp;
            </sec:authorize>
        </td>
        <td nowrap="nowrap">
            <sec:authorize access="!isAuthenticated()">
                <a href = "/login" style="...">LOGIN</a>
            </sec:authorize>
            <sec:authorize access="isAuthenticated()">
                <sec:authentication property="name"/>&nbsp;|&nbsp;|
                <a href = "/logout" style="...">LOGOUT</a>
            </sec:authorize>
        </td>
    </tr>
</table>
