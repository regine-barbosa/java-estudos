package PooLoops01.exercicio03contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;
        ContaBancaria contaBancaria = new ContaBancaria();

        while (opcao != 4){
            System.out.println("====MENU====");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Sair");

            opcao = scanner.nextInt();


            switch (opcao){
                case 1 -> {
                    System.out.println("Digite o valor a se depositar: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    contaBancaria.depositar(valor);

                }
                case 2 -> {
                    System.out.println("Digite o valor a ser sacado: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine();

                    contaBancaria.sacar(valor);


                }
                case 3 -> {
                    contaBancaria.consultarSaldo(contaBancaria.getSaldo());

                }
                case 4 -> System.out.println("Saindo da aplicação...");
                default -> System.out.println("Opção inválida, tente novamente.");
            }

        }


    }
}
