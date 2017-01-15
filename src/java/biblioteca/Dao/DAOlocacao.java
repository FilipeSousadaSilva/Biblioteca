package biblioteca.Dao;


import biblioteca.conexao.Fabrica_Conexao;
import biblioteca.modelo.Cliente;
import biblioteca.modelo.Livros;
import biblioteca.modelo.Locacao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lab3aluno
 */
public class DAOlocacao {
   private Connection con; 

    public DAOlocacao() throws Exception {
        this.con = new Fabrica_Conexao().getconexao();
    }
   public void adiciona(Locacao l) {
       String sql="insert into locacao" + "(datadedelocacao,datadedevolucao,id_livro,codigo_cliente)" + "values(?,?,?,?)";
       try(PreparedStatement stm = this.con.prepareStatement(sql)) {
		stm.setInt(4, l.getCliente().getId());
		stm.setInt(3, l.getLivro().getCod_livro());
		Date datadevolucao = new Date(l.getDatadedevolucao().getTimeInMillis());
		Date datedelocacao = new Date(l.getDatadelocacao().getTimeInMillis());
		stm.setDate(1, datedelocacao);
		stm.setDate(2, datadevolucao);
		stm.execute();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
   }
   
   public void alterar(Locacao l) throws SQLException {
       String sql="update locacao set codigo_cliente=?,id_livro=?,datadedevolucao=?,datadedelocacao=? where cod_locacao=?";
       try(PreparedStatement stm = this.con.prepareStatement(sql)) {
		stm.setInt(1, l.getCliente().getId());
		stm.setInt(2, l.getLivro().getCod_livro());
		Date datadevolucao = new Date(l.getDatadedevolucao().getTimeInMillis());
		Date datedelocacao = new Date(l.getDatadelocacao().getTimeInMillis());
		stm.setDate(3,datadevolucao );
		stm.setDate(4,datedelocacao);
                stm.setInt(5,l.getId());
		stm.execute();
                stm.close();
	} catch (SQLException e) {
		// TODO: handle exception
            throw new RuntimeException(e);
        }
   }
   
   public void excluir(Locacao l) {
       String sql="delete from locacao where cod_locacao=?";
       try(PreparedStatement stm = this.con.prepareStatement(sql)) {
		stm.setInt(1,l.getId());
		stm.execute();
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
	}
   }
   
   public List<Locacao> listalocacao() {
       List<Locacao> lista = new ArrayList<>();
       String sql = "select * from locacao inner join cliente on codigo_cliente=cod_cliente inner join livros on id_livro=cod_livro";
       Locacao l = null;      
       Cliente cl = null;
       Livros li = null;
       try (PreparedStatement stm = this.con.prepareStatement(sql)) {
           try(ResultSet rs = stm.executeQuery()) {
               while (rs.next()) { 
                   l = new Locacao();
                   li= new Livros();
                   cl = new Cliente();
            	   l.setId(rs.getInt("cod_locacao"));
            	   Date datadedevolucao = rs.getDate("datadedevolucao");
            	   Date datadelocacao = rs.getDate("datadedelocacao");
            	   Calendar datadevolucao = Calendar.getInstance();
            	   datadevolucao.setTime(datadedevolucao);
            	   l.setDatadedevolucao(datadevolucao);
            	   Calendar datalocacao = Calendar.getInstance();
            	   datalocacao.setTime(datadelocacao);
            	   l.setDatadelocacao(datalocacao);
                   l.setCliente(cl);
            	   l.getCliente().setId(rs.getInt("codigo_cliente"));
                   l.setLivro(li);
            	   l.getLivro().setCod_livro(rs.getInt("id_livro"));
            	   l.getCliente().setNome(rs.getString("nome")); 
            	   l.getCliente().setEmail(rs.getString("email"));
            	   l.getCliente().setEndereco(rs.getString("endereco"));                   
                   Date datacliente = rs.getDate("datanascimento");
                   Calendar data = Calendar.getInstance();
                   data.setTime(datacliente);
                   l.getCliente().setDatanascimento(data);
                   l.getLivro().setNome(rs.getString("nome_livro"));
                   l.getLivro().setAutor(rs.getString("autor_livro"));
                 l.getLivro().setQuant_disponivel(rs.getInt("quantidadeestoque_livro"));
                   lista.add(l);          
               }
           }
       } catch (Exception e) {
           throw new RuntimeException(e.getMessage());
       }
       return lista;
   }
}
