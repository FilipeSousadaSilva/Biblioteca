/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package biblioteca.modelo;

import java.util.Calendar;

/**
 *
 * @author lab5aluno
 */
public class Cliente {
    private int id;
    private String nome;
    private String email;
    private String endereco;
    private Calendar datanascimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Calendar getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(Calendar datanascimento) {
        this.datanascimento = datanascimento;
    }
}
