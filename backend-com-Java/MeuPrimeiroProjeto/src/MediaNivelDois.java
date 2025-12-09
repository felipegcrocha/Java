import java.util.Scanner;

//Atividade para calcular a média de quatro notas e informar o status do aluno usando o loop for

public class MediaNivelDois {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        double materia1 = 0;
        double materia2 = 0;
        double materia3 = 0;

        System.out.println("Notas de Português");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Insira sua " + i + "ª nota: ");
            double nota = input.nextDouble();
            materia1 = materia1 + nota;
        }
        System.out.println("Sua nota em Português é: " + materia1);

        System.out.println("Notas de Matemática");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Insira sua " + i + "ª nota: ");
            double nota = input.nextDouble();
            materia2 = materia2 + nota;
        }
        System.out.println("Sua nota em Matemática é: " + materia2);

        System.out.println("Notas de História");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Insira sua " + i + "ª nota: ");
            double nota = input.nextDouble();
            materia3 = materia3 + nota;
        }
        System.out.println("Sua nota em História é: " + materia3);

        double media1 = materia1 / 4;
        double media2 = materia2 / 4;
        double media3 = materia3 / 4;

        System.out.println("Sua média em Português é: " + media1);
        if (media1 >= 7) {
            System.out.println("Parabéns! Você foi aprovado em Português.");
        } else if (media1 >= 5) {
            System.out.println("Recuperação em Português.");
        } else {
            System.out.println("Reprovado em Português.");
        }

        System.out.println("Sua média em Matemática é: " + media2);
        if (media2 >= 7) {
            System.out.println("Parabéns! Você foi aprovado em Matemática.");
        } else if (media2 >= 5) {
            System.out.println("Recuperação em Matemática.");
        } else {
            System.out.println("Reprovado em Matemática.");
        }

        System.out.println("Sua média em História é: " + media3);
        if (media3 >= 7) {
            System.out.println("Parabéns! Você foi aprovado em História.");
        } else if (media3 >= 5) {
            System.out.println("Recuperação em História.");
        } else {
            System.out.println("Reprovado em História.");
        }

        input.close();
    }
}