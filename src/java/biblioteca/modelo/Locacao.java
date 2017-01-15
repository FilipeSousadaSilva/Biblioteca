package biblioteca.modelo;


import java.util.Calendar;
import java.util.List;

/**
 *
 * @author lab3aluno
 */
public class Locacao {
    private int id;
    private Calendar datadelocacao;
    private Calendar datadedevolucao;
    private Cliente cliente;
    private Livros livro;

  

    public Calendar getDatadelocacao() {
		return datadelocacao;
	}

	public void setDatadelocacao(Calendar datadelocacao) {
		this.datadelocacao = datadelocacao;
	}

	public Calendar getDatadedevolucao() {
		return datadedevolucao;
	}

	public void setDatadedevolucao(Calendar datadedevolucao) {
		this.datadedevolucao = datadedevolucao;
	}

	public Livros getLivro() {
		return livro;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLivro(Livros livro) {
		this.livro = livro;
	}

	public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
