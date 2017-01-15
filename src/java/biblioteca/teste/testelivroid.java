package biblioteca.teste;



import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import biblioteca.Dao.DaoLivro;
import biblioteca.modelo.Livros;

/**
 *
 * @author lab5aluno
 */
public class testelivroid {
    public static void main(String[] args){
        DaoLivro dao = null;
        try {
            dao = new DaoLivro();
        } catch (Exception ex) {
            Logger.getLogger(testelivroid.class.getName()).log(Level.SEVERE, null, ex);
        }
        Livros li = new Livros();
      
        try {
            li = dao.pega_livro(1);
            System.out.println("nome do livro: " +li.getNome()+ "\n");
            System.out.println("nome do autor: " +li.getAutor()+ "\n");
            System.out.println("quantidade disponível: " +li.getQuant_disponivel()+ "\n");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
           
        
    }
}
