package PooLoops01.exercicio02funcionarios;

import PooLoops01.exercicio01cadastroalunos.Aluno;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double maiorSalario = 0.0;
        double soma = 0.0;
        String nomeDoMaiorSalario = "";

        Funcionario[] listaFuncionario = new Funcionario[2];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome: ");
            String nome = scanner.nextLine();
            System.out.println("Digite o salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            listaFuncionario[i] = new Funcionario(nome, salario);
        }

        for (Funcionario funcionario : listaFuncionario){
            soma += funcionario.getSalario();
            if(funcionario.getSalario() > maiorSalario){
                maiorSalario = funcionario.getSalario();
                nomeDoMaiorSalario = funcionario.getNome();
            }
        }

        double media = soma / listaFuncionario.length;
        for (Funcionario funcionario : listaFuncionario){
            if(funcionario.getSalario() > media){
                System.out.println(funcionario.getNome());

            }

        }
        System.out.println("A média salarial é: " + media);
        System.out.println("O funcionário com maior salário é: " + nomeDoMaiorSalario + " com R$" + maiorSalario);
        System.out.println(Arrays.toString(listaFuncionario));
    }
}
