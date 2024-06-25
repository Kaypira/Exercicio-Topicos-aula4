import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Reutilizando a lista de cursos de graduação do exercício anterior
        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Engenharia Civil", 120));
        cursos.add(new Curso("Medicina", 300));
        cursos.add(new Curso("Administração", 200));
        cursos.add(new Curso("Direito", 250));
        cursos.add(new Curso("Ciência da Computação", 150));

        // Utilizando Streams API para filtrar e calcular
        // Filtrar cursos que possuem entre 10 e 20 alunos
        cursos.stream()
              .filter(curso -> curso.getQuantidadeAlunos() >= 10 && curso.getQuantidadeAlunos() <= 20)
              .forEach(curso -> System.out.println("Curso com entre 10 e 20 alunos: " + curso.getNome()));

        // Calcular a quantidade total de alunos de todos os cursos
        int totalAlunos = cursos.stream()
                                .mapToInt(Curso::getQuantidadeAlunos)
                                .sum();
        
        System.out.println("Total de alunos de todos os cursos: " + totalAlunos);
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
