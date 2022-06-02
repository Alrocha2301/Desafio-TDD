import exercicio01.Exercicio01;
import exercicio02.main.Exercicio02;
import exercicio03.main.Exercicio03;
import exercicio04.main.Exercicio04;
import exercicioDojoPuzzle.model.ExercicioDojoPuzzles;


import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDeExercicios extends InputMismatchException {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 1;
        System.out.print("\t\tMenu de Exercicios - Desafio TDD\n" +
                "\n1 - Exercício 1" +
                "\n2 - Exercício 2" +
                "\n3 - Exercício 3" +
                "\n4 - Exercicio 7" +
                "\n5 - Exercício DojoPuzzles" +
                "\n0 - Sair");

        boolean rodando = true;

        while (rodando) {
            try {
                while (opcao != 0) {
                    System.out.print("\nDigite o número correspondente ao exercício desejado: ");
                    opcao = scan.nextInt();
                    switch (opcao) {
                        case 1 -> Exercicio01.main(args);
                        case 2 -> Exercicio02.main(args);
                        case 3 -> Exercicio03.main(args);
                        case 4 -> Exercicio04.main(args);
                        case 5 -> ExercicioDojoPuzzles.main(args);
                        case 0 -> System.out.println("Encerrando...");

                        default -> System.out.println("Opção Inválida!");
                    }
                }
            } catch (InputMismatchException e) {
                System.out.print("Opção Inválida! Execute novamente o menu!");
            }
            rodando = false;
        }
    }
}


