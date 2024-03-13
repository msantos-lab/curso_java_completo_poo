package set_quantidade_alunos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        Set<Alunos> list = new HashSet<>();

        System.out.print("How many students for course A?  ");
        Integer a = sc.nextInt();

        for(int i = 0; i < a; i++){
            System.out.print("Código do aluno:  ");
            list.add(new Alunos(sc.nextInt()));
        }


        System.out.println();
        System.out.print("How many students for course B?  ");
        Integer b = sc.nextInt();

        for(int i = 0; i < b; i++){
            System.out.print("Código do aluno:  ");
            list.add(new Alunos(sc.nextInt()));
        }

        System.out.println();
        System.out.print("How many students for course C?  ");
        Integer c = sc.nextInt();

        for(int i = 0; i < c; i++){
            System.out.print("Código do aluno:  ");
            list.add(new Alunos(sc.nextInt()));
        }


        System.out.println("Total students: " + list.size());

        for (Alunos ax : list){
            System.out.println(ax);
        }


        sc.close();
    }

}
