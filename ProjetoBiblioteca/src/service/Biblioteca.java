package service;

import java.util.ArrayList;
import java.util.List;
import model.Emprestimo;
import model.Livro;
import model.Usuario;

/**
 *
 * @author lucas
 */
public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Emprestimo> emprestimos = new ArrayList<>();
    
    public void cadastrarLivro(String titulo, String autor, int ano){
        livros.add(new Livro(titulo, autor, ano));
        System.out.println("Livro cadastrado com sucesso!");
    }
    
    public void cadastrarUsuario(String nome, String email){
        usuarios.add(new Usuario(nome, email));
        System.out.println("Usuario cadastrado com sucesso!");
    }
    
    public void listarLivros(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        }else {
            livros.forEach(System.out::println);
        }
    }
    
    public void listarUsuarios(){
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuario cadastrado.");
        } else {
            usuarios.forEach(System.out::println);
        }
    }
    
    public void listarEmprestimos(){
        if (emprestimos.isEmpty()) {
            System.out.println("Nenhum emprestimo registrado.");
        } else {
            emprestimos.forEach(System.out::println);
        }
    }
    
    public void emprestarLivro(int idLivro, int idUsuario) {
        Livro livro = livros.stream().filter(l -> l.getIdLivro() == idLivro && l.isDisponivel()).findFirst().orElse(null);
        Usuario usuario = usuarios.stream().filter(u -> u.getIdUsuario() == idUsuario).findFirst().orElse(null);
        
        if (livro != null && usuario != null) {
            emprestimos.add(new Emprestimo(livro, usuario));
            System.out.println("Emprestimo realizado com sucesso!");
        } else {
            System.out.println("Livro não disponivel ou usuario nao encontrado");
        }
    }
    
    public void devolverLivro(int idLivro){
        for(Emprestimo e : emprestimos){
            if(e.getLivro().getIdLivro() == idLivro && !e.isDevolvido()){
                e.devolver();
                System.out.println("Livro devolvido com sucesso!");
                return;
            }
        }
        System.out.println("Emorestimo nao encontrado ou já devolvido");
    }
}
