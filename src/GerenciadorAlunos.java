import java.util.*;
import java.util.stream.Collectors;

public class GerenciadorAlunos {
    private Map<String, Aluno> alunosMap;

    public GerenciadorAlunos() {
        this.alunosMap = new HashMap<>();
    }

    // Exercício 1
    public void adicionarAluno(Aluno aluno) {
        this.alunosMap.put(aluno.getNome(), aluno);
    }

    public void imprimirAluno(Aluno aluno) {
        System.out.println("Nome: " + aluno.getNome() + " | Aluno: " + aluno.getNota());
    }

    // Exercício 1
    public void imprimirTodosAlunos() {
        alunosMap.values().forEach(this::imprimirAluno);
    }

    // Exercício 2
    public void imprimirNotaAluno(String nomeAluno) {
        if (!this.alunosMap.containsKey(nomeAluno)) {
            System.out.println("Aluno com nome " + nomeAluno + " não localizado.");
            return;
        }

        System.out.println("Nota: " + this.alunosMap.get(nomeAluno).getNota());
    }

    // Exercício 2
    // https://www.baeldung.com/java-stream-to-list-collecting
    // https://www.baeldung.com/java-method-references
    public List<String> recuperarNomeAlunoNotaSuperior(double notaBase) {
        return this.alunosMap
                .entrySet()
                .stream()
                .filter(entrada -> entrada.getValue().getNota() > notaBase)
                .map(Map.Entry::getKey)
                .toList();
    }

    // Exercício 3
    public List<Aluno> removerAlunosNotaInferior(double notaBase) {
        List<Aluno> alunosRemovidos = this.alunosMap
                .values()
                .stream()
                .filter(aluno -> aluno.getNota() < notaBase)
                .toList();

        alunosRemovidos.forEach(aluno -> this.alunosMap.remove(aluno.getNome()));

        return alunosRemovidos;
    }

    // Exercício 4
    // https://howtodoinjava.com/java8/sort-stream-multiple-fields/
    // https://stackoverflow.com/a/43857540/22829483
    public Map<String, Aluno> ordenarAlunosPorNotaDec() {
        Comparator<Aluno> comparadorAluno = Comparator.comparing(Aluno::getNota).reversed();
        Map<String, Aluno> alunosEmOrdem = new LinkedHashMap<>();

        this.alunosMap
                .values()
                .stream()
                .sorted(comparadorAluno)
                .forEach(aluno -> alunosEmOrdem.put(aluno.getNome(), aluno));

        return alunosEmOrdem;
    }
}
