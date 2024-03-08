package vetores;
import java.util.Scanner;

public class Maior_Posicao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Integer[] reais = new Integer[n];
        int maior = 0, posicao = 0;

        for(int i=0; i < reais.length; i++){
            System.out.print("Digite um numero: ");
            reais[i] = sc.nextInt();
            sc.nextLine();            
        }

        for (int l=0; l < reais.length; l++){
            if(reais[l] % 2 == 0){
                maior = reais[l];
                posicao = l;
            }
        }

        System.out.printf("%nMAIOR VALOR = %d %n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d %n", posicao);

        sc.close();
    }

}
