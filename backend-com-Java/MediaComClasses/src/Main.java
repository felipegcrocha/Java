import java.util.Scanner;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    Disciplina[] materias = new Disciplina[4];

    materias[0] = new Disciplina("Português");
    materias[1] = new Disciplina("Matemática");
    materias[2] = new Disciplina("História");
    materias[3] = new Disciplina("Filosofia");

    int totalAprovacoes = 0;
    double somaDasMedias = 0;

    for (int i = 0; i < materias.length; i++) {
        materias[i].inserirNota(input);
        boolean passou = materias[i].validarAprovacao();

        if (passou == true) {
            totalAprovacoes++;
        }

        somaDasMedias = somaDasMedias + materias[i].calcularMedia();
    }

    double cr = somaDasMedias / materias.length;
    System.out.printf("Coeficiente de Rendimento: %.2f.%n", cr);

    if (totalAprovacoes == materias.length) {
        System.out.println("RESULTADO FINAL: Passou de ano! Parabéns.");
    } else {
        System.out.println("RESULTADO FINAL: Reprovado.");
    }
    input.close();
}