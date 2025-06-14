package model;

/**
 *
 * @author lucas
 */
public class Livro {
    private static int idContadorLivro = 1;
    private int idLivro;
    private String titulo;
    private String autor;
    private int anoPubli;
    private boolean disponivel;

    public Livro(String titulo, String autor, int ano) {
        this.idLivro = idContadorLivro++;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPubli = ano;
        this.disponivel = true;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPubli() {
        return anoPubli;
    }

    public void setAnoPubli(int anoPubli) {
        this.anoPubli = anoPubli;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return idLivro + " - " + titulo + " (" + autor + ", " + anoPubli + ") " +
               (disponivel ? "[Disponível]" : "[Emprestado]");
    }

    
    
}
