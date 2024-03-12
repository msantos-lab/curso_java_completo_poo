package interface_parcelas_contrato;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

import interface_parcelas_contrato.model.entities.Contract;
import interface_parcelas_contrato.model.entities.Installment;
import interface_parcelas_contrato.model.services.ContractService;
import interface_parcelas_contrato.model.services.PaypalService;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:  ");
        System.out.print("Numero:   ");
        Integer number = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy):   ");
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato:   ");
        Double totalValue = sc.nextDouble();
        sc.nextLine();

        Contract obj = new Contract(number, date, totalValue);
        System.out.println(obj);


        System.out.print("Entre com o numero de parcelas:   ");
        Integer parcelas = sc.nextInt();
        sc.nextLine();

        ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(obj, parcelas);
		
		System.out.println("Parcelas:");
		for (Installment installment : obj.getInstallments()) {
			System.out.println(installment);
		}


        //System.out.println("Parcelas:  ");

        sc.close();
    }
    
}
