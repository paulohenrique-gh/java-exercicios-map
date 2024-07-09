import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
                .filter(entry -> entry.getValue().getNota() > notaBase)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }
}
