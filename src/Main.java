import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno(new Aluno("Fernando", 8.4));
        gerenciadorAlunos.adicionarAluno(new Aluno("Joana", 3.3));
        gerenciadorAlunos.adicionarAluno(new Aluno("Marcos", 7.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Kelly", 8.7));
        gerenciadorAlunos.adicionarAluno(new Aluno("Pedro", 6.0));

        gerenciadorAlunos.imprimirTodosAlunos();

        // Exercício 2
        System.out.println("\nBuscando notas por nome de aluno");
        System.out.print("Paulo: ");
        gerenciadorAlunos.imprimirNotaAluno("Paulo");
        System.out.print("Kelly: ");
        gerenciadorAlunos.imprimirNotaAluno("Kelly");

        System.out.println("\nBuscando alunos com nota acima de 6");
        List<String> alunosAcimaMedia = gerenciadorAlunos.recuperarNomeAlunoNotaSuperior(6);
        alunosAcimaMedia.forEach(System.out::println);

        // Exercício 3
        System.out.println("\nRemovendo alunos com nota abaixo de 5");
        List<Aluno> alunosRemovidos = gerenciadorAlunos.removerAlunosNotaInferior(5);
        alunosRemovidos.forEach(System.out::println);
        System.out.println("Lista atual de alunos: ");
        gerenciadorAlunos.imprimirTodosAlunos();

        // Exercício 4
        System.out.println("\nAlunos por nota em ordem decrescente");
        Map<String, Aluno> alunosEmOrdemDescrescente = gerenciadorAlunos.ordenarAlunosPorNotaDec();
        alunosEmOrdemDescrescente.entrySet().forEach(System.out::println);
    }

    public static void listarAlunosMaiorNota(double aPartirDeNota, Map<String, Aluno> alunosMap) {
        alunosMap.values().stream()
                .filter(aluno -> aluno.getNota() > aPartirDeNota)
                .map(Aluno::getNome)
                .forEach(System.out::println);
    }

    public static void removerAlunosMenorNota(double aPartirDeNota, Map<String, Aluno> alunosMap) {

    }
}