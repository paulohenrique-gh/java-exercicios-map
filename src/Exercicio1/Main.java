package Exercicio1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Aluno> alunosMap = new HashMap<>();
        alunosMap.put("Fernando", new Aluno("Fernando", 8.4));
        alunosMap.put("Joana", new Aluno("Joana", 3.3));
        alunosMap.put("Marcos", new Aluno("Marcos", 7));
        alunosMap.put("Kelly", new Aluno("Kelly", 8.7));
        alunosMap.put("Pedro", new Aluno("Pedro", 6));

        alunosMap.forEach((nome, aluno) -> {
            System.out.println("Nome: " + nome + " Aluno: " + aluno);
        });
    }
}