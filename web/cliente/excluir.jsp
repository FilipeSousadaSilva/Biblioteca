<%-- 
    Document   : excluir
    Created on : 18/11/2015, 12:03:17
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <form action="../excluircliente">
                Id:<input type="text" name="deleta" />
                <br>
                <input type="submit" value="deletar" />
            </form>
        </table>
    </body>
</html>
