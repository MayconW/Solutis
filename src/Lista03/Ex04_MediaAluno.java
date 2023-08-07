package Lista03;

import java.util.Scanner;

public class Ex04_MediaAluno {


    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        double somaNotas = 0;

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            somaNotas += s.nextDouble();
        }

        double media = somaNotas / 4;


        System.out.println("A media e: " + media);
    }
}





