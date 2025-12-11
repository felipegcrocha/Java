import java.util.Scanner;

public class Disciplina {

    String nomeDaMateria;
    double somaDasNotas;

    public Disciplina(String materia) {
        nomeDaMateria = materia;
    }

    public void inserirNota(Scanner leitor) {
        System.out.printf("Notas avaliativas de %s.%n", this.nomeDaMateria);

        double somaTemporaria = 0;

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

            somaTemporaria += nota;
        }
        this.somaDasNotas = somaTemporaria;
    }

    public double calcularMedia() {
        double media = this.somaDasNotas / 4;
        System.out.printf("Sua média é: %.2f.%n", media);

        return media;
    }

    public boolean validarAprovacao() {
        double media = this.calcularMedia();

        if (media >= 7) {
            System.out.printf("Resultado em %s: APROVADO! %n", this.nomeDaMateria);
            System.out.println("-------------------------------------");
            return true;
        } else if (media >= 6) {
            System.out.printf("Resultado em %s: RECUPERAÇÃO. %n", this.nomeDaMateria);
            System.out.println("-------------------------------------");
            return false;
        } else {
            System.out.printf("Resultado em %s: REPROVADO. %n", this.nomeDaMateria);
            System.out.println("-------------------------------------");
            return false;
        }
    }
}