package interface_locadora_carro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import interface_locadora_carro.model.entities.CarRental;
import interface_locadora_carro.model.entities.Vehicle;
import interface_locadora_carro.model.services.BrazilTaxService;
import interface_locadora_carro.model.services.RentalServices;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel ");
        System.out.print("Modelo do carro: ");
        String model = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy hh:mm):  ");
        LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental aluguel = new CarRental(retirada, retorno, new Vehicle(model));

        //System.out.println(aluguel);      

        System.out.print("Entre com o preço por hora:  ");
        Double pricePerHour = sc.nextDouble();

        System.out.print("Entre com o preço por dia:  ");
        Double pricePerDay = sc.nextDouble();

        RentalServices rentalServices = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxService());
        
        rentalServices.processInvoice(aluguel);

        System.out.println();
        System.out.println("FATURA: ");
        System.out.println("Pagamento basico:  " + aluguel.getInvoice().getBasicPayment());
        System.out.println("Imposto:  " + aluguel.getInvoice().getTax());

        System.out.println("Pagamento total:  " + aluguel.getInvoice().totalPayment());

        sc.close();
    }
    
}
