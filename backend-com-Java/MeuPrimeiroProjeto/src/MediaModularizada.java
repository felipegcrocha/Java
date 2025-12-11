import java.util.Scanner;

public class MediaModularizada {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        String[] materias = {"Português", "Matemática", "História"};

        int totalDeAprovacoes = 0;
        double mediaGeral = 0;

        for (int i = 0; i < materias.length; i++) {
            String materiaAtual = materias[i];
            System.out.println("Calculando a nota de " + materiaAtual);

            double soma = pedirNotaValida(input);

            double media = soma / 4;
            mediaGeral = mediaGeral + media;

            System.out.printf("Sua média em %s é de %.2f.%n", materiaAtual, media);

            if (media >= 7) {
                System.out.printf("Aprovado em %s.%n", materiaAtual);
                totalDeAprovacoes++;
            } else if (media >= 5) {
                System.out.printf("Recuperação em %s.%n", materiaAtual);
            } else {
                System.out.printf("Reprovado em %s.%n", materiaAtual);
            }
            System.out.println("-------------------------");
        }

        mediaGeral = mediaGeral / materias.length;
        System.out.printf("Seu Coeficiente de Rendimento é %.2f.%n", mediaGeral);

        if (totalDeAprovacoes == materias.length) {
            System.out.println("Parabéns! Passou de ano.");
        } else {
            System.out.println("Reprovado.");
        }
        input.close();
    }

    public static double pedirNotaValida (Scanner leitor) {

        double soma = 0;

        for (int x = 1; x <= 4; x++) {
            double nota = -1;
            do {
                try {
                    System.out.printf("Insira sua %sª nota (0 a 10): ", x);
                    nota = leitor.nextDouble();
                    if (nota < 0 || nota > 10) {
                        System.out.println("ERRO: A nota deve ser entre 0 e 10.");
                    }
                } catch (Exception A) {
                    System.out.println("ERRO: Digite apenas caracteres numéricos.");
                    leitor.next();
                }
            } while (nota < 0 || nota > 10);
            soma = soma + nota;
        }
    return soma;
    }
}