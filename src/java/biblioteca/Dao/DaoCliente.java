/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.Dao;

import biblioteca.conexao.Fabrica_Conexao;
import biblioteca.modelo.Cliente;
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
 * @author lab5aluno
 */
public class DaoCliente {
     private Connection con;
    public DaoCliente() throws Exception {
        this.con= new Fabrica_Conexao().getconexao();
    }
    public void adicionacliente(Cliente cliente) {
        String sql ="insert into cliente"+"(nome,email,endereco,datanascimento)"+"values(?,?,?,?)";
        try (PreparedStatement stm = this.con.prepareStatement(sql)) {
            stm.setString(1,cliente.getNome());
            stm.setString(2,cliente.getEmail());
            stm.setString(3,cliente.getEndereco());
            Date datacliente;
            datacliente = new Date(cliente.getDatanascimento().getTimeInMillis());
            stm.setDate(4,datacliente);
            stm.execute();
        } catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }
    public List<Cliente> ListaCliente() {
        List<Cliente> listacliente = new ArrayList<>();
        String sql = "select * from cliente";
        Cliente cli;
        try (PreparedStatement stm = this.con.prepareStatement(sql)) {
            try(ResultSet rs = stm.executeQuery()) {
                cli = new Cliente();
                while (rs.next()) {
                    cli.setId(rs.getInt("cod_cliente"));
                    cli.setNome(rs.getString("nome"));
                    cli.setEmail(rs.getString("email"));
                    cli.setEndereco(rs.getString("endereco"));
                    Date datacliente = rs.getDate("datanascimento");
                    Calendar data = Calendar.getInstance();
                    data.setTime(datacliente);
                    cli.setDatanascimento(data);
                    listacliente.add(cli);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException();
        }
        return listacliente;
    }
        
    public void altera(Cliente cliente) {
        String sql="update cliente set nome=?, email=?, endereco=?, datanascimento=? where cod_cliente=?";
        try(PreparedStatement stm = this.con.prepareStatement(sql)) {
            stm.setString(1,cliente.getNome());
            stm.setString(2,cliente.getEmail());
            stm.setString(3,cliente.getEndereco());
            Date datacliente =new Date(cliente.getDatanascimento().getTimeInMillis());
            stm.setDate(4, datacliente);
            stm.setInt(5, cliente.getId());
            stm.executeUpdate();
            stm.close();
        }catch(SQLException E) {
            System.out.println(E.getMessage());
        }
    }
    public void deleta(Cliente cli) {
        String sql="delete from cliente where cod_cliente=?";
        try(PreparedStatement stm = this.con.prepareStatement(sql)){
            stm.setInt(1, cli.getId());
            stm.execute();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
