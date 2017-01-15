
package biblioteca.Dao;

import biblioteca.conexao.Fabrica_Conexao;
import biblioteca.modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOUsuario {
  
    /*import java.sql.Connection;*/

	private Connection con;
	public DAOUsuario() throws Exception {
		this.con = new Fabrica_Conexao().getconexao();
	}

	public void adiciona(Usuario user) {
		String sql="insert into usuario_login (usuario,senha) values (?,?)";

		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			stm.setString(1, user.getUsuario());
			stm.setString(2, user.getSenha());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}

	}

	public void exclui(Usuario user) {
		String sql="delete * from usuario_login where id_usuario=?";

		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			stm.setInt(1,user.getid());
			stm.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
	}

	public void alterar(Usuario user) {
		String sql="update usuario_login set usuario=?, senha=? where id_usuario=?";

		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			stm.setString(1, user.getUsuario());
			stm.setString(2,user.getSenha());
			stm.setInt(3, user.getid());
			stm.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}
	}

	public List<Usuario> ListaUsuario() {
		List<Usuario> usuarios = new ArrayList<>();
		Usuario u=null;
		String sql= "select * from usuario_login";
		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			try(ResultSet rs = stm.executeQuery()) {
				while (rs.next()) {
					u = new Usuario();
					u.setid(rs.getInt("id_usuario"));
					u.setUsuario(rs.getString("usuario"));
					u.setSenha(rs.getString("senha"));
					usuarios.add(u);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e.getMessage());
		}

		return usuarios;
	}

	public Usuario buscaporid(int id) {
		String sql= "select * from usuario_login where id_usuario=?";
		Usuario u = null;
		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			stm.setInt(1, id);
			try(ResultSet rs = stm.executeQuery()) {
				if (rs.next()) {
					u = new Usuario();
					u.setid(rs.getInt(id));
					u.setUsuario(rs.getString("usuario"));
					u.setSenha(rs.getString("senha"));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new RuntimeException(e.getMessage());
		}

		return u;
	}
	
	public Usuario buscausuario(Usuario u) {
		Usuario usuario = null;
		String sql= "select * from usuario_login where usuario=?";
		try(PreparedStatement stm = this.con.prepareStatement(sql)) {
			stm.setString(1, u.getUsuario());
			try(ResultSet rs = stm.executeQuery()) {
				if (rs.next()) {
					usuario = new Usuario();
					usuario.setid(rs.getInt("id_usuario"));
					usuario.setUsuario(rs.getString("usuario"));
					usuario.setSenha(rs.getString("senha"));
                                        usuario.setTipo(rs.getString("tipo"));
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return usuario;	
        }
        public Usuario validaLogin(Usuario usu) throws SQLException{
        String sql = "select * from usuario_login where usuario = ? AND senha = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.con.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getUsuario());
        stmt.setString(2,usu.getSenha());
               
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Usuario
            usu.setUsuario(rs.getString(2));
            usu.setSenha(rs.getString(3));
            usu.setTipo(rs.getString(4));
            usu.setid(rs.getInt(1));
            // adiciona o usu à lista de usus
            
        }
        
        stmt.close();
        return usu;
    }
}
  

