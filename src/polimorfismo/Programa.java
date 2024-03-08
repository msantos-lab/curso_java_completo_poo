package polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import polimorfismo.entities.Product;
import polimorfismo.entities.ImportedProduct;
import polimorfismo.entities.UsedProduct;

public class Programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product imported = new ImportedProduct();
        Product used = new UsedProduct();
        Product normal = new Product();

        for (int i = 0; i < n; i++) {
            System.out.println();
            System.out.println("Product #" + (1 + i) + " data:");

            System.out.print("Common, used or imported (c/u/i)?    ");
            char type = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name:  ");
            String name = sc.nextLine();

            System.out.print("Price:  ");
            Double price = sc.nextDouble();
            sc.nextLine();

            if (type == 'i') {
                System.out.print("Customs fee:  ");
                Double customsFee = sc.nextDouble();
                sc.nextLine();

                imported = new ImportedProduct(name, price, customsFee);
            } else if (type == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY):  ");
                String manufactureDateString = sc.next();
                LocalDate manufactureDate = LocalDate.parse(manufactureDateString, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

                used = new UsedProduct(name, price, manufactureDate);
            } else {
                normal = new Product(name, price);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        System.out.println(imported.priceTag());
        System.out.println(normal.priceTag());
        System.out.println(used.priceTag());

        sc.close();

    }

}
