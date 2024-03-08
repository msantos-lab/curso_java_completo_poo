import java.util.Scanner;

public class Leitura_Tipos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //String -  só a 1ª palavra: sc.next();
        //String - a linha toda: sc.nextLine();
        //Inteiro: sc.nextInt();
        //Double: sc.nextDouble();
        //Char: sc.next().charAt(0) -> pega o 1º caracter da string
        //

        String x;
        System.out.println("Digite um valor: "); 
        x = sc.next();

        System.out.println("Voce digitou: " + x);

        sc.close();
    }
}
