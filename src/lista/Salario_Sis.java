package lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Salario_Sis {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered?  ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Salario> listaFuncionarios = new ArrayList<>();
        int id, idPesquisa;
        String nome;
        Double salario, percentagem, novoSalario = 0.0;

        for (int i = 0; i < n; i++) {
            System.out.printf("%nEmplyoee #%d: %n", (i + 1));

            System.out.print("Id:  ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name:  ");
            nome = sc.nextLine();

            System.out.print("Salary:  ");
            salario = sc.nextDouble();
            sc.nextLine();

            Salario funcionario = new Salario(id, nome, salario );
            // funcionario.setId(id);
            // funcionario.setNome(nome);
            // funcionario.setSalario(salario);

            listaFuncionarios.add(funcionario);

        }


        System.out.println();
        System.out.println("| Registros:");
        for (Salario x : listaFuncionarios) {
            System.out.println(x);
        }

        System.out.println();
        System.out.print("Enter the employee id that will have salary increase:  ");
        idPesquisa = sc.nextInt();
        sc.nextLine();

        List<Salario> pesquisa = listaFuncionarios.stream().filter(x -> x.getId() == idPesquisa).collect(Collectors.toList());

        if (pesquisa.size() > 0) {
            System.out.print("Enter the percentage:  ");
            percentagem = sc.nextDouble();
            sc.nextLine();

            for (Salario x : pesquisa) {
                System.out.println();
                System.out.println(x);
                novoSalario = Salario.increaseSalary(percentagem, x.getSalario());
                x.setSalario(novoSalario);

            }
        } else {
            System.out.print("This id does not exist!");
            System.out.println();
        }

        System.out.println();
        System.out.println("List of employees:");
        for (Salario func : listaFuncionarios) {
            System.out.println(func);
        }
        System.out.println();

        sc.close();

    }

}
