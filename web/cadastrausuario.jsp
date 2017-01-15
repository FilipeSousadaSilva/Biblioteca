
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@taglib tagdir="/WEB-INF/tags" prefix="rafael"%>
<!DOCTYPE html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <title>Cadastre-se</title>
    </head>
    <body class="jumbotron">
        <div class="jumbotron text-center">
            <h1>Cadastre-se</h1>
        </div>
          <div class="container">
             <div class="row">
           <div class="col-sm-4">
        <form action="adicionaUsuario" method="post">
            Usuario: <input type="text" name="usuario" class="form-control" /><br />
            Senha: <input type="text" name="senha" class="form-control" /><br />
            <div class="checkbox">
                <label><input type="checkbox" name="tipo" value="ADM">Admin?</label>
            </div>
            <input type="submit" value="Gravar" />
        </form>
    </div>  
  </div>
</div>
</body>
