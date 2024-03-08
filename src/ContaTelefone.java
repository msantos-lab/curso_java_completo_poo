import java.util.Locale;
import java.util.Scanner;

public class ContaTelefone {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Locale.setDefault(Locale.US);
        int minutos;
        double totalPagar;
        
        System.out.println("Quantos minutos usou no mês? ");
        minutos = sc.nextInt();

        if(minutos <= 100){
            System.out.println("Valor a pagar: R$ 50.00");
        }else{
            totalPagar = ((minutos - 100) * 2) + 50;
            System.out.printf("Valor a pagar: R$ %.2f", totalPagar);
        }





        sc.close();
    }
    
}
