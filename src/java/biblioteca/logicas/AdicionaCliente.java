/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.logicas;

import biblioteca.Dao.DaoCliente;
import biblioteca.modelo.Cliente;
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
@WebServlet("/adicionacliente")
public class AdicionaCliente extends HttpServlet{

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           try {
            String nome = req.getParameter("nome");
            String endereco = req.getParameter("endereco");
            String email = req.getParameter("email");
            String dataden = req.getParameter("dataNascimento");
            Calendar data= Calendar.getInstance();
            try {
                java.util.Date d = new SimpleDateFormat("dd/MM/yyyy").parse(dataden);
                data.setTime(d);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
            Cliente cli = new Cliente();
            cli.setNome(nome);
            cli.setEmail(email);
            cli.setEndereco(endereco);
            cli.setDatanascimento(data);
            
            DaoCliente dao = new DaoCliente();
            dao.adicionacliente(cli);
            
        } catch (Exception ex) {
            Logger.getLogger(AdicionaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
           RequestDispatcher rd = req.getRequestDispatcher("cliente/adicionado_sucesso.jsp");
           rd.forward(req, resp);
    }
    
}
