/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.teste;

import biblioteca.conexao.Fabrica_Conexao;
import java.sql.Connection;

/**
 *
 * @author lab5aluno
 */
public class testaconexao {

    public testaconexao() {
    }
    
    public static void main(String[] args) throws Exception {
         Connection con = new Fabrica_Conexao().getconexao();
        System.out.println("Conectado!");
        con.close();
    }
}
