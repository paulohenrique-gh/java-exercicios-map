import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Exercício 1
        Map<String, Aluno> alunosMap = new HashMap<>();
        alunosMap.put("Fernando", new Aluno("Fernando", 8.4));
        alunosMap.put("Joana", new Aluno("Joana", 3.3));
        alunosMap.put("Marcos", new Aluno("Marcos", 7));
        alunosMap.put("Kelly", new Aluno("Kelly", 8.7));
        alunosMap.put("Pedro", new Aluno("Pedro", 6));

        alunosMap.forEach((nome, aluno) -> {
            System.out.println("Nome: " + nome + " Aluno: " + aluno);
        });

        // Exercício 2
        imprimirNotaAluno("Paulo", alunosMap);
        imprimirNotaAluno("Kelly", alunosMap);
    }

    public static void imprimirNotaAluno(String nomeAluno, Map<String, Aluno> alunosMap) {
        if (!alunosMap.containsKey(nomeAluno)) {
            System.out.println("Aluno com nome " + nomeAluno + " não localizado.");
            return;
        }

        alunosMap.entrySet().stream()
                .filter(entry -> entry.getKey().equalsIgnoreCase(nomeAluno))
                .forEach(entry -> System.out.println(entry));
    }
}