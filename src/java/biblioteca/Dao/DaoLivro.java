package biblioteca.Dao;

/*
 * o change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import biblioteca.conexao.Fabrica_Conexao;
import biblioteca.modelo.Livros;

/**
 *
 * @author lab3aluno
 */
public class DaoLivro {

       private Connection con; 
    public DaoLivro() throws Exception {
        this.con = new Fabrica_Conexao().getconexao();
    }
    
    public void adiciona_livro(Livros livro) throws SQLException {
        String sql="insert into livros"+"(nome_livro,autor_livro,quantidadeestoque_livro)"+"values(?,?,?)";
           try (PreparedStatement stm = this.con.prepareStatement(sql)){
               stm.setString(1,livro.getNome());
               stm.setString(2,livro.getAutor());
               stm.setInt(3, livro.getQuant_disponivel());
               stm.execute();
           } catch (SQLException e) {
               System.out.println(e.getMessage());
           } 
    }
    public List<Livros> lista_livros() throws SQLException {
         List<Livros> listalivros = new ArrayList();
         Livros l; 
         String sql="select * from livros";
         try(PreparedStatement stm = this.con.prepareStatement(sql)) {
             try(ResultSet rs = stm.executeQuery()) {
                 l = new Livros();
                 while(rs.next()) {
                     l.setCod_livro(rs.getInt("cod_livro"));
                     l.setNome(rs.getString("nome_livro"));
                     l.setAutor(rs.getString("autor_livro"));
                     l.setQuant_disponivel(rs.getInt("quantidadeestoque_livro"));
                     listalivros.add(l);
                 }
             }
         } catch(SQLException e) {
             System.out.println(e.getMessage());
         } 
        return listalivros; 
    } 
    
    public Livros pega_livro(int id) throws SQLException {
        String sql="select * from livros where cod_livro=?";
        Livros l = new Livros();
        try(PreparedStatement stm = this.con.prepareStatement(sql)) {
            stm.setInt(1,id);
            stm.execute();
            try(ResultSet rs = stm.executeQuery()) {
                if (rs.next()) {
                l.setNome(rs.getString("nome_livro"));
                l.setAutor(rs.getString("autor_livro"));
                l.setQuant_disponivel(rs.getInt("quantidadeestoque_livro"));
                }
            }
        }
        return l;
    }
    public void alteralivro(Livros l) {
        String sql="update livros set nome_livro=?,autor_livro=?,quantidadeestoque_livro=? where cod_livros=?";
        try(PreparedStatement stm = this.con.prepareStatement(sql)){
            stm.setString(1,l.getNome());
            stm.setString(2,l.getAutor());
            stm.setInt(3,l.getQuant_disponivel());
            stm.setInt(4, l.getCod_livro());
            stm.execute();
            stm.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void deleta_livro(Livros l) {
        String sql="delete from livros where cod_livros=?";
        try(PreparedStatement stm = this.con.prepareStatement(sql)) {
            stm.setInt(1, l.getCod_livro());
            stm.execute();
            stm.close();
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
