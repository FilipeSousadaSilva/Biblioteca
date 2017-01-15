/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.teste;

import biblioteca.Dao.DAOlocacao;
import biblioteca.modelo.Locacao;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author lab5aluno
 */
public class testelistalocacao {
    public static void main(String[] args) throws Exception {
		 DAOlocacao dao = new DAOlocacao();
		 List<Locacao> lista = dao.listalocacao();
                 
                
	        try {
	            for(Locacao l : lista ) {
	            	System.out.println("codido da locação: " + l.getId() + "\n");
                          
                        System.out.println("data de locação: " + l.getDatadelocacao() + "\n");
	            	
                        System.out.println("data de devolução: " +l.getDatadedevolucao().getTimeInMillis()+ "\n");
	            	System.out.println("id do cliente: " +l.getCliente().getId() + "\n");
	            	System.out.println("nome do cliente" +l.getCliente().getNome()+ "\n");
	            	System.out.println("email do cliente:" +l.getCliente().getEmail() + "\n");
	            	System.out.println("endereço do cliente: " +l.getCliente().getEmail() + "\n");
	            	System.out.println("data de nascimento do cliente: " +l.getCliente().getDatanascimento() + "\n");
	            	System.out.println("código do livro: " + l.getLivro().getCod_livro()+ "\n");
	                System.out.println("nome do livro: " +l.getLivro().getNome()+ "\n");
	                System.out.println("nome do autor: " +l.getLivro().getAutor()+ "\n");
	                System.out.println("quantidade disponível: " +l.getLivro().getQuant_disponivel()+ "\n");
	            }
	        } catch (Exception ex) {
	            System.out.println(ex.getMessage());
	        }
	 
	}
}
