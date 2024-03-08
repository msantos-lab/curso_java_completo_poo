package vetores;
import java.util.Scanner;

public class Numeros_Pares {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        sc.nextLine();

        Integer[] pares = new Integer[n];
        
        for(int i=0; i < pares.length; i++){
            System.out.print("Digite um numero: ");
            pares[i] = sc.nextInt();
            sc.nextLine();            
        }

        int cont = 0;
       
        System.out.printf("%nNUMEROS PARES: ");
        for(Integer numero : pares){
            if(numero % 2 == 0){
                System.out.printf("%d  ", numero);
                cont++;
            }
        }

        System.out.printf("%n%nQUANTIDADE DE PARES = %d", cont);

        sc.close();
    }
}
