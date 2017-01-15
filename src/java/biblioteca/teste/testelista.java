package biblioteca.teste;

import java.sql.SQLException;
import java.util.List;

import biblioteca.Dao.DaoLivro;
import biblioteca.modelo.Livros;


public class testelista {
    public static void main(String[] args) throws SQLException, Exception {
        DaoLivro dao = new DaoLivro();
        List<Livros> lista = dao.lista_livros();
        for (Livros li : lista) {
            System.out.println("nome do livro: " +li.getNome()+ "\n");
            System.out.println("nome do autor: " +li.getAutor()+ "\n");
            System.out.println("quantidade disponível: " +li.getQuant_disponivel()+ "\n");
        }
    }
}
