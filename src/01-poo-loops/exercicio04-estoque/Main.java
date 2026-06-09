package PooLoops01.exercicio04estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);
        //ArrayList<Produto> listaProdutos = new ArrayList<>();
        Estoque estoque = new Estoque();

        while (opcao != 4){
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.println("Digite a quantidade do produto: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine();

                    Produto produto = new Produto(nome, quantidade);
                    estoque.adicionarProduto(produto);


                }
                case 2 -> {
                    System.out.println("\n--- Listagem: ---\n");
                    estoque.listarProdutos();
                }
                case 3 -> {
                    System.out.println("Digite o nome do produto para busca: ");
                    String busca = scanner.nextLine();

                    estoque.buscarProduto(busca);

                }
                case 4 -> System.out.println("Saindo da aplicação...");
                default -> System.out.println("Opção inválida, tente novamente!");
            }

        }
    }
}
