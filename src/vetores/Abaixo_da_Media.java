package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Abaixo_da_Media {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor?  ");
        int n = sc.nextInt();
        sc.nextLine();

        Double[] notas = new Double[n];
        double soma = 0.0, media;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite um numero:  ");
            notas[i] = sc.nextDouble();
            sc.nextLine();
        }
        System.out.println();

        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        media = soma / notas.length;
        System.out.printf("MEDIA DO VETOR = %.3f %n", media);

        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for (Double valor : notas) {
            if (valor <= 10) {
                System.out.println(valor);
            }
        }

        sc.close();
    }

}
