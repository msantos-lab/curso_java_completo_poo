package contratos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import contratos.entities.Departament;
import contratos.entities.HourContract;
import contratos.entities.Worker;
import contratos.enums.WorkerLevel;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name:  ");
        Departament department = new Departament(sc.nextLine());


        System.out.println("Enter worker data:");
        System.out.print("Name:  ");
        String name = sc.nextLine();

        System.out.print("Level:  ");
        String level = sc.nextLine();

        System.out.print("Base salary:  ");
        Double baseSalary = sc.nextDouble();

        Worker funcionario = new Worker(name, WorkerLevel.valueOf(level), baseSalary,  department);

        System.out.println(funcionario);


        System.out.print("How many contracts to this worker?  ");
        int n = sc.nextInt();
        sc.nextLine();

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Enter contract #" + (i+1) + " data:");
            System.out.print("Date (DD/MM/YYYY):  ");
            String dataContratoString = sc.nextLine();

            System.out.print("Value per hour:  ");
            Double valueHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer durationHours = sc.nextInt();
            sc.nextLine();

            LocalDate dataContrato = LocalDate.parse(dataContratoString, fmt1);
            HourContract contrato = new HourContract(dataContrato, valueHour, durationHours);

            funcionario.addContract(contrato);

        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String dataIncome = sc.nextLine();

        String[] dataIncomeArray = dataIncome.split("/");      
        Integer mes = Integer.parseInt(dataIncomeArray[0]);
        Integer ano = Integer.parseInt(dataIncomeArray[1]);

        System.out.println(funcionario);
        System.out.println("Income for "+ dataIncome + ":  $" + String.format("%.2f", funcionario.income(mes, ano) ));


        sc.close();
    }

}
