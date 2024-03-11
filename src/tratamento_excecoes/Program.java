package tratamento_excecoes;

import java.util.Locale;
import java.util.Scanner;

import tratamento_excecoes.entities.Account;
import tratamento_excecoes.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try{
        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Holder: ");
        String name = sc.nextLine();

        System.out.print("Initial balance: ");
        Double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account correntista =  new Account(number, name, initialBalance, withdrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        Double amountWithdraw = sc.nextDouble();

        correntista.withdraw(amountWithdraw);

        System.out.printf("New balance:  %.2f", correntista.getBalance());


        } catch (DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());

        }
        finally {
            sc.close();
        }
    }
}
