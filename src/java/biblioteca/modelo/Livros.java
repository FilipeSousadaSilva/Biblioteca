package biblioteca.modelo;

import java.util.Calendar;


public class Livros {
    private int cod_livro;
    private String nome;
    private String autor;
    private int quant_disponivel;

    public int getCod_livro() {
        return cod_livro;
    }

    public void setCod_livro(int cod_livro) {
        this.cod_livro = cod_livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQuant_disponivel() {
        return quant_disponivel;
    }

    public void setQuant_disponivel(int quant_disponivel) {
        this.quant_disponivel = quant_disponivel;
    }

    
}
