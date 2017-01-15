<%-- 
    Document   : cadastrarlivros
    Created on : 18/11/2015, 18:50:35
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<c:import url="../cabecalho.jsp" ></c:import>
        <form action="../AdicionaLivro" method="post">
         Nome: <input type="text" name="nome" /><br />
         Autor: <input type="text" name="autor" /><br />
         Quantidade: <input type="text" name="quantidade" /><br />
         <input type="submit" value="Gravar" />
        </form>
<c:import url="../rodape.jsp"> </c:import>   
