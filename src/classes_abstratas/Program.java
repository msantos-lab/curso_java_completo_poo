package classes_abstratas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import classes_abstratas.entities.Company;
import classes_abstratas.entities.Individual;
import classes_abstratas.entities.TaxPayer;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<TaxPayer> contribuintes = new ArrayList<TaxPayer>();        
        double total = 0.0;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();
            sc.nextLine();

            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                sc.nextLine();

                TaxPayer contribuinte = new Individual(name, anualIncome, healthExpenditures);
                contribuintes.add(contribuinte);
            } else {
                System.out.print("Number of employees: ");
                Integer employees = sc.nextInt();
                sc.nextLine();

                TaxPayer contribuinte = new Company(name, anualIncome, employees);
                contribuintes.add(contribuinte);
            }
        }

        System.out.println();
        System.out.println("TAXES PAID: ");
        for (TaxPayer c : contribuintes) {
            System.out.println(c);
            total += c.tax();
        }

        System.out.println();
        System.out.println(String.format("TOTAL TAXES: $ %.2f", total));

        sc.close();
    }

}
