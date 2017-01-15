<%-- 
    Document   : alterarlivro
    Created on : 18/11/2015, 18:49:59
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="../cabecalho.jsp"></c:import>
        <form action="../AlteraLivros" method="post">
            id: <input type="text" name="id"/><br />   
         Nome: <input type="text" name="nome" /><br />
         autor: <input type="text" name="autor" /><br />
         Quantidade_estoque: <input type="text" name="quantidade" /><br />
         <input type="submit" value="alterar" />
        </form>
<c:import url="../rodape.jsp"></c:import>   