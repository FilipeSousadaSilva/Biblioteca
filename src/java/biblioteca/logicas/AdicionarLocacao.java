/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DAOlocacao;
import biblioteca.Dao.DaoCliente;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livros;
import biblioteca.modelo.Locacao;
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
@WebServlet("/AdicionarLocacao")
public class AdicionarLocacao extends HttpServlet{
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
             try {
            int cod_cliente = Integer.parseInt(req.getParameter("id_cliente"));
            int cod_livro = Integer.parseInt(req.getParameter("id_livro"));
            String dataden = req.getParameter("datadedevolucao");
            String dataden2 = req.getParameter("datadelocacao");
            Calendar data= Calendar.getInstance();
            Calendar data2= Calendar.getInstance();
            try {
                java.util.Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dataden);
                data.setTime(d);
                java.util.Date d1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataden2);
                data2.setTime(d1);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
                 DAOlocacao dao =new DAOlocacao();
            Locacao l = new Locacao();
            Livros li =new Livros();
            Cliente CLI = new Cliente();
            CLI.setId(cod_cliente);
            li.setCod_livro(cod_livro);
            l.setCliente(CLI);
            l.setLivro(li);
            l.setDatadedevolucao(data);
            l.setDatadelocacao(data2);
            dao.adiciona(l);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
           RequestDispatcher rd = req.getRequestDispatcher("locacaoes/adicionadasucesso.jsp");
           rd.forward(req, resp);
}
}
