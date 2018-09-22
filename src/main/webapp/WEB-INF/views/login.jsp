<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

    <title>LOGIN</title>
    <jsp:include page="helper/prefix.jsp"/>

    <form action ='<spring:url value ="/loginAction"/>' method="post">
        <table width = "400" border = "0" cellpadding = "10" cellspacing = "10" style="..." align = "center">
            <tr>
                <td colspan = "2" align = "center">
                    <h2>AUTHORIZATION</h2>
                </td>
            </tr>
            <tr>
                <td>USERNAME</td>
                <td><input type = "text" name = "login"></td>
            </tr>
            <tr>
                <td>PASSWORD</td>
                <td><input type = "password" name = "password"></td>
            </tr>
            <tr>
                <td><button type = "submit">LOGIN</button></td>
            </tr>

        </table>
    </form>
