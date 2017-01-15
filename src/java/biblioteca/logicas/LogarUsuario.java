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
import javax.servlet.http.HttpSession;

@WebServlet("/LogarUsuario")
public class LogarUsuario extends HttpServlet{
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String nome = req.getParameter("nome");
            String senha = req.getParameter("senha");
            String tipo = req.getParameter("tipo");
            Usuario usu= new Usuario();
            usu.setUsuario(nome); 
            usu.setSenha(senha);
            usu.setTipo(tipo);
            String message;
            DAOUsuario doUsuario = new DAOUsuario();
            Usuario retornoUsuario = doUsuario.buscausuario(usu);
        
            if(retornoUsuario != null){
                if(usu.getSenha().equals(retornoUsuario.getSenha())){
                    req.getSession().setAttribute("UuarioLogado",usu);
                    RequestDispatcher rd = req.getRequestDispatcher("menu.jsp");
                    rd.forward(req, resp);
                }else{
                    RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                    rd.forward(req, resp);
                    req.setAttribute("message", "Usario existe, mas senha errada");
                }
            }else{
                RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
                rd.forward(req, resp);
                req.setAttribute("message", "Usuário não existe");
            }
            }   catch (Exception ex) {
                Logger.getLogger(LogarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
    }    