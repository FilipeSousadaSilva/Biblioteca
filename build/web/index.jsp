<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Bem vindo</title>
    </head>
    <body class="jumbotron">
        <div class="jumbotron text-center">
            <h1>Bem-vindo!</h1>
        </div>
          <div class="container">
             <div class="row">
           <div class="col-sm-4">
        <form action="LogarUsuario" method="post">     
            Usuário: <input type="text" name="nome" class="form-control" id="usuario" placeholder="Preencha com o usuário"/><br />
            Senha: <input type="text" name="senha" class="form-control" id="pwd" placeholder="Preencha com a senha" /><br />
            </br>
            <div class="checkbox">
                <label><input type="checkbox" name="tipo" value="ADM">Admin?</label>
            </div>
         <br></br>
         <input type="submit" value="Logar" class="btn btn-primary"/>
         <p> ${InvalidUser}</p>
         <p> ${InvalidPassword} </p>
         <a href="cadastrausuario.jsp">Cadastre-se</a>
         </form>   
    </div>  
  </div>
</div>
    </body>
</html>