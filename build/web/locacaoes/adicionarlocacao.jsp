<%-- 
    Document   : adicionalocacao
    Created on : 18/11/2015, 21:08:03
    Author     : lab5aluno
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="" %>
<!DOCTYPE html>
<c:import url="../cabecalho.jsp"></c:import>
        <form action="../AdicionarLocacao" method="post">
         id_cliente: <input type="text" name="id_cliente" /><br />
         id_livro: <input type="text" name="id_livro" /><br />
         datadevolucao: <rafael:campoData id="datadedevolucao"/><br />
         datadedelocacao: <rafael:campoData id="datadelocacao" /><br />
         <input type="submit" value="Gravar" />
        </form>
<c:import url="../rodape.jsp"></c:import>
