<%-- 
    Document   : alteracliente
    Created on : 18/11/2015, 12:03:48
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="../alterarcliente" method="post">
         ID: <input type="text" name="id" /><br />
         Nome: <input type="text" name="nome" /><br />
         E-mail: <input type="text" name="email" /><br />
         Endereço: <input type="text" name="endereco" /><br />
         Data Nascimento: <vitor:campoData id="dataNascimento" /> <br />
         <input type="submit" value="Alterar" />
    </body>
</html>
