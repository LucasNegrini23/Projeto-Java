package model;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class Emprestimo {
    private static int contadotIdEmp = 1;
    private int idEmp;
    private Livro livro;
    private Usuario usuario;
    private LocalDate dataEmp;
    private LocalDate dataDev;
    private boolean devolvido;

    public Emprestimo(Livro livro, Usuario usuario) {
        this.idEmp = contadotIdEmp++;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmp = LocalDate.now();
        this.devolvido = false;
        this.livro.setDisponivel(false);
    }
    
    public void devolver(){
        this.devolvido = true;
        this.dataDev = LocalDate.now();
        this.livro.setDisponivel(true);
    }

    public int getIdEmp() {
        return idEmp;
    }

    public void setIdEmp(int idEmp) {
        this.idEmp = idEmp;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public LocalDate getDataEmp() {
        return dataEmp;
    }

    public void setDataEmp(LocalDate dataEmp) {
        this.dataEmp = dataEmp;
    }

    public LocalDate getDataDev() {
        return dataDev;
    }

    public void setDataDev(LocalDate dataDev) {
        this.dataDev = dataDev;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "Emprestimo " + idEmp + ": " + livro.getTitulo() + " para " + usuario.getNome() +
                " em " + dataEmp + (devolvido ? " (Devolvido em " + dataDev + ")" : "(Em andamento)");
    }
    
    
    
    
}
