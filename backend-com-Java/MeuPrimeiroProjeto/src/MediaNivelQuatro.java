import java.util.Scanner;

//Aprimoroamento do código para calcular a média de quatro notas
//em múltiplas disciplinas. Agora o código irá delimitar o input de 0 a 10, usando do-while.

public class MediaNivelQuatro {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String[] materias = {"Português", "Matemática", "História"};

        int totalAprovacoes = 0;
        double mediaGeral = 0;

        for (int i = 0; i < materias.length; i++) {
            String materiaAtual = materias[i];
            System.out.println("Calculando notas de: " + materiaAtual);
            double soma = 0;
            for (int x = 1; x <= 4; x++) {
                double nota;
                do {
                    System.out.print("Insira sua " + x + "ª nota (0-10): ");
                    nota = input.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("ERRO: A nota deve ser entre 0 e 10.");
                    }
                } while (nota < 0 || nota > 10);
                soma = soma + nota;
            }
            double media = soma / 4;
            mediaGeral = mediaGeral + media;
            System.out.printf("Sua média de %s é %.2f%n", materiaAtual, media);
            if (media >= 7) {
                System.out.println("Aprovado em " + materiaAtual);
                totalAprovacoes++;
            } else if (media >=5) {
                System.out.println("Recuperação em " + materiaAtual);
            } else {
                System.out.println("Reprovado em " + materiaAtual);
            }
        }

        mediaGeral = mediaGeral / materias.length;
        System.out.printf("Seu Coeficiente de Rendimento é: %.2f%n", mediaGeral);

        if (totalAprovacoes == materias.length) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
        input.close();
    }
}