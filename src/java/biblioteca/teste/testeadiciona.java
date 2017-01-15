/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.teste;

import biblioteca.Dao.DAOUsuario;
import biblioteca.Dao.DaoLivro;
import biblioteca.modelo.Livros;
import biblioteca.modelo.Usuario;
import java.sql.SQLException;

/**
 *
 * @author lab5aluno
 */
public class testeadiciona {
    public testeadiciona() {
    }
    public static void main(String[] args) throws SQLException, Exception{
       Livros l = new Livros();
       l.setNome("A Arte da Guerra");
       l.setAutor("Sun Tzu");
       l.setQuant_disponivel(12);
       DaoLivro li = new DaoLivro();
       DAOUsuario dao = new DAOUsuario();
       Usuario usu = new Usuario();
       Usuario usu2 = new Usuario();
       usu.setUsuario("vitor");
       usu.setSenha("vitor");
       
       usu2 = dao.validaLogin(usu);
        System.out.println(usu2.getUsuario());
        System.out.println(usu2.getSenha());
        System.out.println(usu2.getTipo());
        System.out.println(usu2.getid());
        
    }
}
