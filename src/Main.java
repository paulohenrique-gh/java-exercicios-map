import java.util.List;
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

        // Exercício 3
        listaAlunosMaiorNota(6, alunosMap);
    }

    public static void imprimirNotaAluno(String nomeAluno, Map<String, Aluno> alunosMap) {
        if (!alunosMap.containsKey(nomeAluno)) {
            System.out.println("Aluno com nome " + nomeAluno + " não localizado.");
            return;
        }

        double notaAluno = alunosMap.get(nomeAluno).getNota();
        System.out.println("Nome: " + nomeAluno + " | Nota: " + notaAluno);
    }

    public static void listaAlunosMaiorNota(double aPartirDeNota, Map<String, Aluno> alunosMap) {
        alunosMap.values().stream()
                .filter(aluno -> aluno.getNota() > aPartirDeNota)
                .map(aluno -> aluno.getNome())
                .forEach(nome -> System.out.println(nome));
    }
}