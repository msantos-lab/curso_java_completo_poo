package vetores;

import java.util.Scanner;

public class Soma_Dois_Vetores {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int n = sc.nextInt();
        sc.nextLine();

        int[] vetorA = new int[n];
        int[] vetorB = new int[n];
        int[] vetorC = new int[n];

        for(int i=0 ; i < vetorA.length; i++){
            System.out.print("Digite um numero do vetor A: ");
            vetorA[i] = sc.nextInt();
            sc.nextLine();            
        }
        System.out.println();

        for(int i=0 ; i < vetorB.length; i++){
            System.out.print("Digite um numero do vetor B: ");
            vetorB[i] = sc.nextInt();
            sc.nextLine();            
        }
        System.out.println();


        for(int i=0 ; i < vetorC.length; i++){
            vetorC[i] = vetorA[i] +  vetorB[i];       
        }
        System.out.println();

        System.out.println("VETOR RESULTANTE:");
        for(int x : vetorC){
            System.out.println(x);
        }

        sc.close();
    }
    
}
