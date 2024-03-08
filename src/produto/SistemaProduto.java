package produto;

import java.util.Locale;
import java.util.Scanner;

public class SistemaProduto {
    
    public static void main(String[] args) {
        Product sistemaProdutos = new Product();
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter product data:");
        System.out.print("Name: ");
        sistemaProdutos.name = sc.nextLine();

        System.out.print("Price: ");
        sistemaProdutos.price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        sistemaProdutos.quantity = sc.nextInt();

        double total = sistemaProdutos.price * sistemaProdutos.quantity;

        System.out.println();

        System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f %n", sistemaProdutos.name, sistemaProdutos.price, sistemaProdutos.quantity, total);
        System.out.println();


        System.out.print("Enter the number of products to be ADDED in stock: ");
        sistemaProdutos.quantity += sc.nextInt();
        sistemaProdutos.AddProducts(sistemaProdutos.quantity);
        System.out.println();

        System.out.print("Enter the number of products to be REMOVED from stock: ");
        sistemaProdutos.quantity -= sc.nextInt();
        sistemaProdutos.RemoveProducts(sistemaProdutos.quantity);

        sc.close();

    }
}
