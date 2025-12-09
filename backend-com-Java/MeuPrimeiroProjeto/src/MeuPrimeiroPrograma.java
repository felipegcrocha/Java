import java.util.Scanner;

//Atividade para calcular a média de quatro notas e informar o status do aluno

public class MeuPrimeiroPrograma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bem vindo! Insira sua primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.println("Insira sua segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.println("Insira sua terceira nota: ");
        double nota3 = input.nextDouble();

        System.out.println("Insira sua quarta nota: ");
        double nota4 = input.nextDouble();

        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        double media = somaDasNotas / 4;

        System.out.println("Sua média é: " + media);

        if (media >= 7) {
            System.out.println("Parabéns! Você foi aprovado.");
        } else if (media >= 5 && media < 7) {
            System.out.println("Recuperação.");
        } else {
            System.out.println("Reprovado.");
        }
        input.close();
    }
}
