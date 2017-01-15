<%-- 
    Document   : mostralivro
    Created on : 24/11/2015, 14:54:51
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="biblioteca.Dao.DaoLivro" %>
<%@page import="biblioteca.modelo.Livros" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int id = Integer.parseInt(request.getParameter("id"));
                DaoLivro dao = new DaoLivro();
                Livros l = new Livros();
                l= dao.pega_livro(id);
        %>
        <table>
            <td>Id: <%=l.getCod_livro() %> </td>
            <td>Nome: <%=l.getNome() %> </td>
            <td>Autor: <%=l.getAutor() %></td>
            <td>Quantidade disponível: <%=l.getQuant_disponivel() %> </td>
        </table>
    </body>
</html>
