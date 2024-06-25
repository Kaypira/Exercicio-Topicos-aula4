import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando a lista de cursos
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Engenharia Civil", 120));
        cursos.add(new Curso("Medicina", 300));
        cursos.add(new Curso("Administração", 200));
        cursos.add(new Curso("Direito", 250));
        cursos.add(new Curso("Ciência da Computação", 150));

        // Ordenando os cursos por quantidade de alunos (decrescente)
        Collections.sort(cursos, (c1, c2) -> c2.getQuantidadeAlunos() - c1.getQuantidadeAlunos());

        // Imprimindo o resultado usando forEach
        cursos.forEach(curso -> System.out.println(curso.getNome() + ": " + curso.getQuantidadeAlunos() + " alunos"));
    }

    // Classe que representa um curso de graduação
    static class Curso {
        private String nome;
        private int quantidadeAlunos;

        public Curso(String nome, int quantidadeAlunos) {
            this.nome = nome;
            this.quantidadeAlunos = quantidadeAlunos;
        }

        public String getNome() {
            return nome;
        }

        public int getQuantidadeAlunos() {
            return quantidadeAlunos;
        }
    }
}
