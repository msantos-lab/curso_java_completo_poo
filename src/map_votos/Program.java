package map_votos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class Program {
    public static void main(String[] args) {

        String caminho = "C:\\Arquivos_java\\votos.txt";

        File arquivo = new File(caminho);
        Integer sumVotos = 0;
        Map<String, Integer> list = new LinkedHashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nome = fields[0];

                if (list.containsKey(nome)) {
                    sumVotos = list.get(nome);
                    sumVotos += Integer.parseInt(fields[1]);
                    list.put(nome, sumVotos);
                } else {
                    sumVotos = Integer.parseInt(fields[1]);
                    list.put(nome, sumVotos);
                }

                line = br.readLine();
            }

            for (String key : list.keySet()) {
                System.out.println(key + ": " + list.get(key));
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
