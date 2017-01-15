<%-- 
    Document   : listarlivro
    Created on : 18/11/2015, 18:51:30
    Author     : lab5aluno
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@page import="biblioteca.Dao.DaoLivro"  %>
<%@page import="biblioteca.modelo.Livros" %>
<!DOCTYPE html>
<c:import url="cabecalho.jsp"></c:import>
        <table>
        <% 
            DaoLivro dao = new DaoLivro();
            List<Livros> listalivros =  dao.lista_livros();
            
            for(Livros li : listalivros) {
        %>
            <tr>
                <td> Nome: <%=li.getNome()  %> </td><br/>
                <td> Autor: <%=li.getAutor()  %> </td><br/>
                <td> Quantidade em estoque: <%=li.getQuant_disponivel()  %> </td><br/>
            </tr>
            <%
                }
            %>
        </table>
<c:import url="rodape.jsp"></c:import>