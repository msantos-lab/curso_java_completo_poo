package banco;

import java.util.Locale;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        
        Scanner sc =  new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta;


        System.out.print("Enter account number: ");
        int numeroConta = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String nome = sc.nextLine();
       
        System.out.print("Is there na initial deposit (y/n)?: ");
        char question = sc.next().charAt(0);

        System.out.printf("[%d - %s - %s] %n%n", numeroConta, nome, question);

        double depositoInicial = 0.0, valor;

        if(question == 'y' || question == 'Y'){          
            System.out.print("Enter initial deposit value: ");
            depositoInicial = sc.nextDouble();
            conta = new Conta(numeroConta, nome, depositoInicial);
            System.out.println();
        }else{
            conta = new Conta(numeroConta, nome);
        }
        
        System.out.println("Account data: ");
        System.out.println(conta);
        System.out.println();


        System.out.print("Enter a deposit value: ");
        valor = sc.nextDouble();
        conta.deposito(valor);

        System.out.println("Updated account data: ");
        System.out.println(conta);
        System.out.println();
        
        
        System.out.print("Enter a withdraw value: ");
        valor = sc.nextDouble();
        conta.saque(valor);
        System.out.println(); 

        System.out.println("Updated account data: ");
        System.out.println(conta);
        System.out.println();   


        sc.close();
    }
}
