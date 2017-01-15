<%-- 
    Document   : locadosucesso
    Created on : 18/11/2015, 21:10:55
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="../RemoveLocacao" method="post">
         Id Locacao: <input type="text" name="cod_locacao" /><br />
         <input type="submit" value="Excluir" />
        </form>
    </body>
</html>
