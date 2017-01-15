<%-- 
    Document   : lista-clientes
    Created on : 18/11/2015, 18:12:25
    Author     : lab5aluno
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="biblioteca.Dao.DaoCliente" %>
<%@page import="biblioteca.modelo.Cliente" %>
<!DOCTYPE html>
<c:import url="cabecalho.jsp"></c:import>
        <table>
            <% 
                DaoCliente dao = new DaoCliente();
                List<Cliente> listacliente = dao.ListaCliente();
                
                for(Cliente cli : listacliente) {
            %>
            <tr>
            <td>Nome: <%=cli.getNome()  %> </td><br/>
            <td>Endereco: <%=cli.getEndereco()  %> </td><br/>
            <td>Email: <%=cli.getEmail()  %> </td><br/>
            <td>DatadeNascimento: <fmt:formatDate pattern="dd/MM/yyyy"  value="<%=cli.getDatanascimento().getTime() %>" /></td><br/>
            </tr>
            <%
                }
            %>
        </table>
<c:import url="rodape.jsp"></c:import>
