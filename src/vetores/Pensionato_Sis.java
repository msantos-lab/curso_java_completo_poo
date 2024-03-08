package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Pensionato_Sis {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Pensionato[] pensionato = new Pensionato[10];
        String nome, email;
        int nQuarto;

        System.out.print("How many rooms will be rented? ");
        int qtQuartos = sc.nextInt();
        sc.nextLine(); //limpar quebra de linha do buffer

        for (int i = 0; i < qtQuartos; i++) {

            System.out.printf("%nRent #%d: %n", (i+1));
            System.out.print("Name:  ");
            nome = sc.nextLine();

            System.out.print("Email:  ");
            email = sc.nextLine();

            System.out.print("Room:  ");
            nQuarto = sc.nextInt();
            sc.nextLine();

            pensionato[nQuarto] = new Pensionato(nome, email);
        }

        System.out.printf("%nBusy rooms:%n");
        for (int i = 0; i < pensionato.length; i++) {

            if (pensionato[i] != null) {
                System.out.println(i + ": " + pensionato[i].getName() + ", " + pensionato[i].getEmail());
            }
        }

        sc.close();
    }

}
