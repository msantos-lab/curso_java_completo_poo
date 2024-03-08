public class Exercicios {

    public static void main(String[] args) {

        //1) Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
        //mensagem explicativa, conforme exemplos.

        int somaClass1 = Exercicios.Exercicio1(10, 30);
        System.out.println("SOMA = " + somaClass1);
        System.out.println();
        
        int somaClass2 = Exercicios.Exercicio1(-30, 10);
        System.out.println("SOMA = " + somaClass2);
        System.out.println();
                
        int somaClass3 = Exercicios.Exercicio1(0, 0);
        System.out.println("SOMA = " + somaClass3);
        System.out.printf("%n %n");


        //2) Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
        //casas decimais conforme exemplos.
        double area1 = Exercicio2(2.00);
        System.out.println("A= " + area1);
        System.out.println();

        double area2 = Exercicio2(100.64);
        System.out.println("A= " + area2);
        System.out.println();

        double area3 = Exercicio2(150.00);
        System.out.println("A= " + area3);
        System.out.printf("%n %n");

        //3) Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
        //de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
        
        int diferenca1 = Exercicio3(5, 6, 7, 8);
        System.out.println("DIFERENÇA = " + diferenca1);

        int diferenca2 = Exercicio3(5, 6, -7, 8);
        System.out.println("DIFERENÇA = " + diferenca2);
        System.out.printf("%n %n");


        //4) Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
        //hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
        //decimais.

        double[] valores1 = Exercicio4(25, 100, 5.50);
        System.out.println("NUMBER = " + (int)valores1[0] );
        System.out.println("SALARY = U$ " + valores1[1]);
        System.out.println();

        double[] valores2 = Exercicio4(1, 200, 20.50);
        System.out.println("NUMBER = " + (int)valores2[0] );
        System.out.println("SALARY = U$ " + valores2[1]);
        System.out.println();

        double[] valores3 = Exercicio4(6, 145, 15.55);
        System.out.println("NUMBER = " + (int)valores3[0] );
        System.out.println("SALARY = U$ " + valores3[1]);
        System.out.printf("%n %n");


        //5) Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
        //código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

    }

    public static int Exercicio1(int valor1, int valor2){
        int soma = valor1 + valor2;
        return soma;
    }

    public static double Exercicio2(double area){
        double raio = 3.14159 *  Math.pow(area, 2);
        return Math.round(raio * 10000.0) / 10000.0;
    }

    public static int Exercicio3(int A, int B, int C, int D){
        int diferenca =  (A * B - C * D);
        return diferenca;
    }

    public static double[] Exercicio4(int numeroF, int horasT, double valorH){
        double salary = horasT * valorH;

        double[] valores = {numeroF, salary};

        return valores;
    }

    
    
    
}
