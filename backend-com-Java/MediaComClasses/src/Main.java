import java.util.Scanner;
import java.util.ArrayList;

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

//  ARRAY
//  Disciplina[] materias = new Disciplina[4];
//  materias[0] = new Disciplina("Português");
//  materias[1] = new Disciplina("Matemática");
//  materias[2] = new Disciplina("História");
//  materias[3] = new Disciplina("Filosofia");

//  ARRAY LIST
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    disciplinas.add(new Disciplina("Português"));
    disciplinas.add(new Disciplina("Matemática"));
    disciplinas.add(new Disciplina("História"));
    disciplinas.add(new Disciplina("Filosofia"));
    disciplinas.add(new Disciplina("Geografia"));

    int totalAprovacoes = 0;
    double somaDasMedias = 0;

    for (int i = 0; i < disciplinas.size(); i++) {
        disciplinas.get(i).inserirNota(input);
        boolean passou = disciplinas.get(i).validarAprovacao();

        if (passou == true) {
            totalAprovacoes++;
        }

        somaDasMedias = somaDasMedias + disciplinas.get(i).calcularMedia();
    }

    double cr = somaDasMedias / disciplinas.size();
    System.out.printf("Coeficiente de Rendimento: %.2f.%n", cr);

    if (totalAprovacoes == disciplinas.size()) {
        System.out.println("RESULTADO FINAL: Passou de ano! Parabéns.");
    } else {
        System.out.println("RESULTADO FINAL: Reprovado.");
    }
    input.close();
}