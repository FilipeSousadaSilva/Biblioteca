<%-- 
    Document   : listalocacao
    Created on : 23/11/2015, 17:27:00
    Author     : lab5aluno
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="biblioteca.Dao.DAOlocacao" %>
<%@page import="biblioteca.modelo.Locacao" %>
<!DOCTYPE html>
<c:import url="cabecalho.jsp"></c:import>

    <table>
<%
        DAOlocacao dao = new DAOlocacao();
        List<Locacao> locacoes = dao.listalocacao();
        for(Locacao l : locacoes) {
%>
        <tr>
            <td>Código da Locação:  <%=l.getId() %></td>
            <td>Data de Locacão: <fmt:formatDate pattern="dd/MM/yyyy" value="<%=l.getDatadelocacao().getTime() %>" /></td>
            <td>Data de devolução: <fmt:formatDate pattern="dd/MM/yyyy" value="<%=l.getDatadedevolucao().getTime() %>" /></td>
            <td>id do cliente: <%=l.getCliente().getId() %></td>
            <td>nome do cliente: <%=l.getCliente().getNome() %> </td>
            <td>email do cliente: <%=l.getCliente().getEmail() %> </td>
            <td>endereço do cliente: <%=l.getCliente().getEndereco() %></td>
            <td>data de nascimento do cliente:<fmt:formatDate pattern="dd/MM/yyyy" value="<%=l.getCliente().getDatanascimento().getTime() %>" /></td>
            <td>código do livro:<%=l.getLivro().getCod_livro() %></td>
            <td>nome do Livro: <%=l.getLivro().getNome()  %></td>
            <td>nome do autor: <%=l.getLivro().getAutor()  %></td>
            <td>quantidade disponível:<%=l.getLivro().getQuant_disponivel() %> </td>
        </tr>
        <%
            }
        %>
    </table>
<c:import url="rodape.jsp"> </c:import>        
