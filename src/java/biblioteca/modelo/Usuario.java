package biblioteca.modelo;

public class Usuario {
   
   private String usuario;
   private String senha;
   private int id;
   private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   public int getid() {
        return this.id;
    }

    
    public void setid(int id) {
        this.id = id;
    } 
   
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

   
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" + "usuario=" + usuario + ", senha=" + senha + ", id=" + id + ", tipo=" + tipo + '}';
    }    
}