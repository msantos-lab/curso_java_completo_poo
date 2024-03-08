package vetores;

import java.util.Scanner;

public class Netagativos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar?  ");
        int n =  sc.nextInt();
        sc.nextLine();

        int[] vec = new int[n];

        for(int i = 0; i < vec.length; i++){
            System.out.print("Digite um numero: ");
            vec[i] = sc.nextInt();
        }

        System.out.println("NUMEROS NEGATIVOS:");
        for(int obj : vec ){
            if(obj < 0){
                System.out.println(obj);
            }
        }

        sc.close();

    }
}
