<%-- 
    Document   : cadastracliente
    Created on : 18/11/2015, 12:02:48
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael" %>
<!DOCTYPE html>
<c:import url="../cabecalho.jsp"></c:import>
        <form action="../adicionacliente" >
         Nome: <input type="text" name="nome" /><br />
         E-mail: <input type="text" name="email" /><br />
         Endereço: <input type="text" name="endereco" /><br />
         Data Nascimento: <rafael:campoData id="dataNascimento" /><br />
         <input type="submit" value="Gravar" />
</form>
<c:import url="../rodape.jsp"></c:import>
