package projetobiblioteca;

import java.util.Scanner;
import service.Biblioteca;

/**
 *
 * @author lucas
 */
public class ProjetoBiblioteca {

    public static void main(String[] args) {
       Biblioteca biblioteca = new Biblioteca();
       Scanner sc = new Scanner(System.in);
       int op;
       
        do {
            System.out.println("\n MENU BIBLIOTECA");
            System.out.println("1. Cadastrar Livro");
            System.out.println("2. Cadastrar Usuario");
            System.out.println("3. Listar livros");
            System.out.println("4. Listar usuarios");
            System.out.println("5. Emprestar livro");
            System.out.println("6. Devolver livro");
            System.out.println("7. Listar emprestimos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            op = sc.nextInt();
            sc.nextLine();
            
            switch(op) {
                case 1 -> {
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("Ano de publicacao: ");
                    int ano = sc.nextInt();
                    sc.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor, ano);
                    break;
                }
                case 2 -> {
                    System.out.println("Nome: ");
                    String nome = sc.nextLine();
                    System.out.println("Email: ");
                    String email = sc.nextLine();
                    biblioteca.cadastrarUsuario(nome, email);
                    break;
                }
                case 3 -> {
                    biblioteca.listarLivros();
                    break;
                }
                case 4 -> {
                    biblioteca.listarUsuarios();
                    break;
                }
                case 5 -> {
                    System.out.println("ID do livro: ");
                    int idLivro = sc.nextInt();
                    System.out.println("ID do usuario: ");
                    int idUsuario = sc.nextInt();
                    biblioteca.emprestarLivro(idLivro, idUsuario);
                    break;
                }
                case 6 -> {
                    System.out.println("ID do livro: ");
                    int idDevolucao = sc.nextInt();
                    biblioteca.devolverLivro(idDevolucao);
                    break;
                }
                case 7 -> {
                    biblioteca.listarEmprestimos();
                    break;
                }
                case 0 -> {
                    System.out.println("Saindo...");
                    break;
                }
                default  -> {
                    System.out.println("Opcao inalida");
                }
            }
        } while (op != 0);
        
        sc.close();
    }
    
}
