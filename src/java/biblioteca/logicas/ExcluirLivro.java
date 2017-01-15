/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DaoLivro;
import biblioteca.modelo.Livros;
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
@WebServlet("/RemoveLivro")
public class ExcluirLivro extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       int id = Integer.parseInt(req.getParameter("id"));
        Livros l = new Livros();
        l.setCod_livro(id);
        try {
            DaoLivro dao = new DaoLivro();
            dao.deleta_livro(l);
        } catch (Exception ex) {
            Logger.getLogger(ExcluirLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher rd = req.getRequestDispatcher("livros/excluidosucesso.jsp");
        rd.forward(req, resp);
    }
    
}
