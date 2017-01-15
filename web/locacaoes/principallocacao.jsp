<%-- 
    Document   : clienteprincipal
    Created on : 18/11/2015, 12:01:53
    Author     : lab5aluno
--%>

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
                <td><a href="alterarlocacao.jsp">Alterar locacao</a></td>
                <td><a href="adicionarlocacao.jsp">Cadastrar locacao</a></td>
                <td><a href="excluido.jsp">Excluir locacao</a></td>
                <td><a href="../listalocacao.jsp">Exibir Lista de locações</a></td>
            </tr>       
            <%
            } else {
            %>
            <tr>
                <td><a href="../listalocacao.jsp">Exibir Lista de locações</a></td>
            </tr>
            <%
            }
            %>
        </table> 
        </div>
        <c:import url="../rodape.jsp"></c:import>
   
