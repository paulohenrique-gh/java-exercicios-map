import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno(new Aluno("Fernando", 84.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Mayara", 95.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Olavo", 87.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Joana", 33.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Marcos", 70.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Kelly", 89.0));
        gerenciadorAlunos.adicionarAluno(new Aluno("Pedro", 60.0));

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
        alunosEmOrdemDescrescente.values().forEach(gerenciadorAlunos::imprimirAluno);

        // Exercício 5
        System.out.println("\nAgrupando alunos por faixa");
        Map<String, List<Aluno>> alunosAgrupados = gerenciadorAlunos.agruparAlunosPorFaixa();
        for (Map.Entry<String, List<Aluno>> entry : alunosAgrupados.entrySet()) {
            System.out.println(entry.getKey() + ": ");
            System.out.println(entry.getValue());
        }
    }
}