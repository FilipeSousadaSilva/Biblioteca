/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.conexao;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Fabrica_Conexao {
    Connection con = null;
     public Connection getconexao()throws Exception,SQLException{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection con = null;
        String user="root";
        String pass="1234";
        String pathconexao="jdbc:mysql://localhost/biblioteca";
        try {
            return (Connection) DriverManager.getConnection(pathconexao, user, pass);
            } catch (SQLException e) {
             throw new RuntimeException(e);
                }
    
    }
}
