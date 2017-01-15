/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;
import java.sql.Date;
import biblioteca.Dao.DAOlocacao;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livros;
import biblioteca.modelo.Locacao;
import java.io.IOException;
import java.text.DateFormat;
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
@WebServlet("/AlteraLocacao")
public class AlterarLocacao extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          try {
            int cod_locacao = Integer.parseInt(req.getParameter("cod_locacao"));
            int cod_cliente = Integer.parseInt(req.getParameter("id_cliente"));
            int cod_livro = Integer.parseInt(req.getParameter("id_livro"));
            String dataden = req.getParameter("datadedevolucao");
            String dataden2 = req.getParameter("datadelocacao");
            Calendar data= Calendar.getInstance();
            Calendar data2= Calendar.getInstance();
            
            
            
            System.out.println("DataDevolução = " + dataden);
            System.out.println("DataLocação = " + dataden2);
            
            try {
                DateFormat d = new SimpleDateFormat("dd/MM/yyyy");
                data.setTimeInMillis(d.parse(dataden).getTime());
                DateFormat dv = new SimpleDateFormat("dd/MM/yyyy");
                data2.setTimeInMillis(dv.parse(dataden2).getTime());
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
              DAOlocacao dao = new DAOlocacao();
            Locacao l = new Locacao();
            Livros li =new Livros();
            Cliente CLI = new Cliente();
            CLI.setId(cod_cliente);
            li.setCod_livro(cod_livro);
            l.setCliente(CLI);
            l.setLivro(li);
            l.setId(cod_locacao);
            l.setDatadedevolucao(data);
            l.setDatadelocacao(data2);
          
            System.out.println("DataDevolução = " + data);
            System.out.println("DataLocação = " + data2);
            
            
            dao.alterar(l);
        } catch (Exception ex) {
            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
           RequestDispatcher rd = req.getRequestDispatcher("locacaoes/alteradosucesso.jsp");
           rd.forward(req, resp);
    }
    
}
