/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.logicas;

import biblioteca.Dao.DAOUsuario;
import biblioteca.modelo.Usuario;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author filip
 */
@WebServlet("/adicionaUsuario")
public class adicionaUsuario extends HttpServlet{
   

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           try {
            String usuario = req.getParameter("usuario");
            String senha = req.getParameter("senha");
            String tipo = req.getParameter("tipo");
            
            Usuario cli = new Usuario();
            cli.setUsuario(usuario);
            cli.setSenha(senha);
            cli.setTipo(tipo);
            
            DAOUsuario dao = new DAOUsuario();
            dao.adiciona(cli);
            
           RequestDispatcher rd = req.getRequestDispatcher("cliente/adicionado_sucesso.jsp");
           rd.forward(req, resp);
    }   catch (Exception ex) {
            Logger.getLogger(adicionaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
}


