<%--
  Created by IntelliJ IDEA.
  User: Yaroslav
  Date: 15.09.2018
  Time: 12:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
   <title>${param.title}</title>
    <style>
        body{
            margin: 0px;
            padding: 0;
        }
        a{
            color:white;
            text-decoration: none;
        }
        button{
            font-size: 1.1em;
            background-color: #4CAF50;
            border: none;
            color: white;
            padding: 10px 28px;
            text-align: center;
            text-decoration: none;
            display: inline-block;
        }

        .green{background-color: #4CAF50;}
        .blue{background-color: #008CBA;}
        .red{background-color: #F43366;}
        .gray{background-color: #E7E7E7; color:black;}
        .black{background-color: #555555;}

        input[type="text"], input[type="date"], input[type="number"], input[type = "password"]{
            border: 1px solid black;
            border-radius: 3px;
            -webkit-border-radius: 3px;
            -moz-border-radius: 3px;
            background: #ffffff !important;
            outline: none;
            height: 34px;
            width: 350px;
            font-family: 'Arial', serif;
            color: black;
            font-size: 1.6em;
        }
    </style>
</head>
<body>
<jsp:include page="../main-menu.jsp" />
<table width="100%" cellpadding="0" cellspacing="0" border="0">
    <tr>
        <td width="20" nowrap="nowrap">&nbsp;</td>
        <td width="100%"></td>
    </tr>
</table>
</body>
</html>
