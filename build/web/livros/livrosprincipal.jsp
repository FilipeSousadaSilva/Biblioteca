<%@page import="biblioteca.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
    <body>
        <c:import url="../cabecalho.jsp"></c:import>
        <div class="containermain">
        <table>
        <%
            HttpServletRequest req = null;
            Usuario usu = (Usuario) session.getAttribute("UuarioLogado");
            if (usu.getTipo().equals("ADM")) {
        %>
            <tr>
                <td><a href="alterarlivro.jsp">Alterar Livros</a></td>
                <td><a href="cadastrarlivros.jsp">Cadastrar Livros</a></td>
                <td><a href="excluirlivro.jsp">Excluir Livro</a></td>
                <td><a href="../lista-livro.jsp">Lista de Livros</a></td>
                <td><a href="buscalivro.jsp">Buscar Livro</a></td>
            </tr> 
            <%
            } else {
            %>
            <tr>
                <td><a href="../lista-livro.jsp">Lista de Livros</a></td>
                <td><a href="buscalivro.jsp">Buscar Livro</a></td>
            </tr>
            <%
            }
            %>
        </table> 
        </div>
        <c:import url="../rodape.jsp"></c:import>