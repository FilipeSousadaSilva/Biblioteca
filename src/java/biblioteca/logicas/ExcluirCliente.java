/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DaoCliente;
import biblioteca.modelo.Cliente;
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
 * @author lab5aluno
 */
@WebServlet("/excluircliente")
public class ExcluirCliente extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("deleta"));
        Cliente cli = new Cliente();
        cli.setId(id);
        DaoCliente dao = null;
        try {
            dao = new DaoCliente();
        } catch (Exception ex) {
            Logger.getLogger(ExcluirCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        dao.deleta(cli);
        RequestDispatcher rd = req.getRequestDispatcher("cliente/excluido_sucesso.jsp");
        rd.forward(req, resp);
        
    }
    
}
