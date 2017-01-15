/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DAOlocacao;
import biblioteca.modelo.Locacao;
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
@WebServlet("/RemoveLocacao")
public class ExcluirLocacao extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      int id = Integer.parseInt(req.getParameter("cod_locacao"));
        Locacao lo = new Locacao();
        lo.setId(id);
        try {
            DAOlocacao l = new DAOlocacao();
            l.excluir(lo);
        } catch (Exception ex) {
            Logger.getLogger(ExcluirLocacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        RequestDispatcher rd = req.getRequestDispatcher("locacaoes/excluirlocacao.jsp");
        rd.forward(req, resp);
    }
    
}
