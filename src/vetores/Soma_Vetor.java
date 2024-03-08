package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Soma_Vetor {
    public static void main(String[] args) {
       
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int n = sc.nextInt();
        sc.nextLine();

        double[] vetor = new double[n];


        for(int i=0 ; i < vetor.length; i++){
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            sc.nextLine();            
        }
        System.out.println();


        double soma = 0; 
        double media = 0;

        for(double obj : vetor){
            soma += obj;
        }

        media = soma / vetor.length;


        System.out.print("VALORES = ");

        for (int i=0; i<n; i++) {
	    	System.out.printf("%.1f  ", vetor[i]);
	    }
        
        System.out.println();
        System.out.printf("SOMA = %.1f %n", soma);
        System.out.printf("MEDIA = %.1f %n", media);


        sc.close();

    }

}
