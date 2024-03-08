package enumeracao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import enumeracao.entities.Client;
import enumeracao.entities.Order;
import enumeracao.entities.OrderItem;
import enumeracao.entities.Product;
import enumeracao.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nomeCliente, emailCliente, birthClienteEntrada, status;
        int qtdOrder, qtProduto;
        String nomeProduto;
        double precoProduto; 


        System.out.println("Enter cliente data:");
        System.out.print("Name:  ");
        nomeCliente = sc.nextLine();

        System.out.print("Email:  ");
        emailCliente = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY):  ");
        birthClienteEntrada = sc.nextLine();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        String dia = birthClienteEntrada.substring(0, 2);
        String mes = birthClienteEntrada.substring(3, 5);
        String ano = birthClienteEntrada.substring(6, 10);
        String birthClienteForm = dia + "/" + mes + "/" + ano;

        LocalDate birthCliente = LocalDate.parse(birthClienteForm, fmt1);
        System.out.println();

        Client cliente = new Client(nomeCliente, emailCliente, birthCliente);


        System.out.println("Enter order data:");
        System.out.print("Status:  ");
        status = sc.nextLine();

        System.out.print("How many items to this order?  ");
        qtdOrder = sc.nextInt();
        sc.nextLine();
        

        LocalDateTime date = LocalDateTime.now();     
        Order pedido = new Order(date, OrderStatus.valueOf(status), cliente);

        OrderItem orderItem = new OrderItem();
        
        for(int i = 0; i < qtdOrder; i++){
            System.out.printf("%nEnter #%d item data: %n", (i+1));
            System.out.print("Product name:  ");
            nomeProduto = sc.nextLine();

            System.out.print("Product price:  ");
            precoProduto = sc.nextDouble();
            sc.nextLine();

            Product produto = new Product(nomeProduto, precoProduto);

            System.out.print("Quantity:  ");
            qtProduto = sc.nextInt();
            sc.nextLine();

            orderItem = new OrderItem(qtProduto, precoProduto);
            orderItem.addItem(produto);
            pedido.addItem(orderItem);
        }

        System.out.println();
        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment:  " + pedido.getMoment().format(fmt2));
        System.out.println("Order status:   " + pedido.getStatus());
        System.out.println(cliente);

        System.out.println();
        System.out.println("Order items:");

        for(OrderItem itens : pedido.getItems()){
            System.out.println(itens);
        }

        System.out.println("Total price: $" + pedido.total());

        System.out.println();
        sc.close();
    }
}
