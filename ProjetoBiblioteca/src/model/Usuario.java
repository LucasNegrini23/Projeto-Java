package model;

/**
 *
 * @author lucas
 */
public class Usuario {
    private static int contadotIdUsuario = 1;
    private int idUsuario;
    private String nome;
    private String email;

    public Usuario(String nome, String email) {
        this.idUsuario = contadotIdUsuario++;
        this.nome = nome;
        this.email = email;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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
    
     @Override
    public String toString() {
        return idUsuario + " - " + nome + " (" + email + ")";
    }
    
}
