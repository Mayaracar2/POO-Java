package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Path arquivo = Paths.get("src/professores_disciplina.txt");

        System.out.println(arquivo.getFileName());
        System.out.println(arquivo.getParent());

        Map<String, String> documento = new HashMap<>();

        try {
            List<String> linhas = Files.readAllLines(arquivo);

            linhas.forEach((linha) -> {
                String[] linhaQuebrada = linha.split("=");
                documento.put(linhaQuebrada[0], linhaQuebrada[1]);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        documento.forEach((chave, valor) -> {
            System.out.println("Professor (chave): " + chave);
            System.out.println("Disciplina (valor): " + valor);
            System.out.println("--------------------");
        });
    }
}