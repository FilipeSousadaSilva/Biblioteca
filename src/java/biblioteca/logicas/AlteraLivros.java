/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DaoCliente;
import biblioteca.Dao.DaoLivro;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livros;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
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
@WebServlet("/AlteraLivros")
public class AlteraLivros extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                try {
            String ID = req.getParameter("id");
            int id = Integer.parseInt(ID);
            String nome = req.getParameter("nome");
            String autor = req.getParameter("autor");
            String estoque = req.getParameter("quantidade");
            int q = Integer.parseInt(estoque);
    
                Livros l = new Livros();
                l.setCod_livro(id);
                l.setNome(nome);
                l.setAutor(autor);
                l.setQuant_disponivel(q);
                    DaoLivro dao = new DaoLivro();
                    dao.alteralivro(l);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
           RequestDispatcher rd = req.getRequestDispatcher("livros/alteradosucesso.jsp");
           rd.forward(req, resp);
    }
}
