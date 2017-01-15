<%-- 
    Document   : alterarlocacao
    Created on : 18/11/2015, 21:09:19
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael" %>
<!DOCTYPE html>
<c:import url="../cabecalho.jsp"></c:import>
         <form action="../AlteraLocacao" method="post">
         cod_locacao: <input type="text" name="cod_locacao" /><br />
         id_cliente: <input type="text" name="id_cliente" /><br />
         id_livro: <input type="text" name="id_livro" /><br />
         datadevolucao: <rafael:campoData id="datadedevolucao" /><br />
         datadedelocacao: <rafael:campoData  id="datadelocacao" /><br />
         <input type="submit" value="Gravar" />
        </form>
<c:import url="../rodape.jsp" ></c:import>
