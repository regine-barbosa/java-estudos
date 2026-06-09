package PooLoops01.exercicio01cadastroalunos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double maiorNota = Double.MIN_VALUE;
        String alunoMaiorNota = "";
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        double soma = 0.0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = scanner.nextLine();
            System.out.println("Digite a nota do aluno: ");
            double nota = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, nota);
            listaAlunos.add(aluno);
        }


        for(Aluno aluno : listaAlunos){
            if(aluno.getNota() > maiorNota){
                maiorNota = aluno.getNota();
                alunoMaiorNota = aluno.getNome();
            }
            System.out.println(aluno);
            soma += aluno.getNota();
        }

        double media = soma / listaAlunos.size();
        System.out.println("A média das notas da turma é: " + media);
        System.out.println("O aluno(a) com maior nota é o: " + alunoMaiorNota);

    }
}
