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
import java.sql.Date;
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
@WebServlet("/AdicionaLivro")
public class AdicionaLivro extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");
            String autor = req.getParameter("autor");
            String estoque = req.getParameter("quantidade");
            int est = Integer.parseInt(estoque);
          
            
        Livros l = new Livros();
        l.setNome(nome);
         l.setAutor(autor);
         l.setQuant_disponivel(est);
        try {
            DaoLivro DAO = new DaoLivro();
            DAO.adiciona_livro(l);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaLivro.class.getName()).log(Level.SEVERE, null, ex);
        }
        RequestDispatcher rd = req.getRequestDispatcher("livros/cadastradocomsucesso.jsp");
        rd.forward(req, resp);
    }
    
}
