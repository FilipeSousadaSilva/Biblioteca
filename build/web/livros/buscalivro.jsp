<%-- 
    Document   : buscalivro
    Created on : 24/11/2015, 14:49:54
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
       <form action="../mostralivro.jsp" method="post">
         Id Livro: <input type="text" name="id" /><br />
         <input type="submit" value="Pesquisar" />
        </form>
    </body>
</html>
