package biblioteca.teste;

import java.util.Calendar;

import biblioteca.Dao.DAOlocacao;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livros;
import biblioteca.modelo.Locacao;

public class testelocacao {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		DAOlocacao dao = new DAOlocacao();
		Locacao l = new Locacao();
		Cliente c = new Cliente();
		c.setId(1);
		Livros li = new Livros();
		li.setCod_livro(1);
		l.setCliente(c);
		l.setLivro(li);
		Calendar datdev = Calendar.getInstance();
		datdev.set(2016, 12, 2);
		l.setDatadedevolucao(datdev);
		Calendar datlocacao = Calendar.getInstance();
		datlocacao.set(2015, 1, 10);
		l.setDatadelocacao(datdev);
		dao.adiciona(l);
		System.out.println("Locacao efetuada com sucesso!");
	}

}
