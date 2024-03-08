package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Altura_Sis {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas?  ");
        int n = sc.nextInt();
        sc.nextLine();

        Altura[] pessoas = new Altura[n];

        String nome;
        Integer idade;
        int menorIdadeQtd = 0;
        Double altura;
        Double mediaAltura = 0.0;
        Double somaAltura = 0.0;
        int contador = 0;

        for (int i = 0; i < pessoas.length; i++) {

            System.out.printf("Dados da %da pessoa:  %n", i + 1);

            System.out.print("Nome: ");
            nome = sc.nextLine();

            System.out.print("Idade: ");
            idade = sc.nextInt();
            sc.nextLine();

            System.out.print("Altura: ");
            altura = sc.nextDouble();
            sc.nextLine();

            pessoas[i] = new Altura(nome, idade, altura);

        }

        for (Altura obj : pessoas) {
            somaAltura += obj.getAltura();

            if (obj.getIdade() < 16) {
                menorIdadeQtd++;
            }
            contador++;
        }

        String[] menoresIdadeNomes = new String[menorIdadeQtd];
        int index = 0;

        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i].getIdade() < 16) {
                menoresIdadeNomes[index] = pessoas[i].getNome();
                index++;
            }
        }


        System.out.println();
        mediaAltura = somaAltura / contador;
        System.out.printf("Altura média:  %.2f %n", mediaAltura);

        double percentual = ((double) menorIdadeQtd / pessoas.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n", percentual);

        for (String nomes : menoresIdadeNomes) {
            System.out.println(nomes);
        }

        sc.close();
    }

}
