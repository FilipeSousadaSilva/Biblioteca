package biblioteca.teste;

import java.util.Calendar;

import biblioteca.Dao.DaoCliente;
import biblioteca.modelo.Cliente;

public class testeadicionacliente {

	public static void main(String[] args) throws Exception {
		DaoCliente dao = new DaoCliente();
		Cliente cli = new Cliente();
		cli.setNome("Rafael Martins");
		cli.setEmail("koga.bujinkan@gmail.com");
		cli.setEndereco("Rua erval Seco 299");
		Calendar datadenascimento = Calendar.getInstance();
		datadenascimento.set(1991, 11, 8);
		cli.setDatanascimento(datadenascimento);
		dao.adicionacliente(cli);
		System.out.println("Cliente: " +cli.getNome() + "adicionado com sucesso!");
	}
}
