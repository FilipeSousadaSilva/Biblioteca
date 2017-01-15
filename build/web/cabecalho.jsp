<%-- 
    Document   : cabecalho
    Created on : 18/11/2015, 14:20:25
    Author     : lab5aluno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
       <head>
            <title>BiblioFatec</title>
            <link rel="stylesheet" href="stylesheets/biblioteca_estilo.css">
            <link rel ="stylesheet" href="stylesheets/jquery-ui.css">
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
            <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	</head>
	
	<body>
		<header>
	<nav class="navbar navbar-inverse">
           <div class="container-fluid">
           <div class="navbar-header">
               <a class="navbar-brand" href="#">FatecZS</a>
           </div>
           <ul class="nav navbar-nav">
      <li class="active"><a href="http://localhost:8080/trabalho_biblioteca/menu.jsp">Home</a></li>
      <li><a href="http://localhost:8080/trabalho_biblioteca/cliente/clienteprincipal.jsp">área cliente</a></li>
      <li><a href="http://localhost:8080/trabalho_biblioteca/livros/livrosprincipal.jsp">área livros</a></li>
      <li><a href="http://localhost:8080/trabalho_biblioteca/locacaoes/principallocacao.jsp">área locações</a></li>
    </ul>
               <ul class="nav navbar-nav navbar-right">
      <li><a href="/trabalho_biblioteca/logout"><span class="glyphicon glyphicon-user"></span>Deslogar</a></li>
    </ul>
  </div>
</nav>
</header>
        
