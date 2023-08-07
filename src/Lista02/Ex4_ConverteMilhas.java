package Lista02;

import java.util.Scanner;

public class Ex4_ConverteMilhas {

	public static void main(String[] args) {
		double km, milhas;

		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite q quantidade de Milhas: ");
		milhas = s.nextInt();

		km = milhas * 1.609;
		System.out.print(milhas + " Milhas = " + km  +" km ");
		
		s.close();
	}

}
