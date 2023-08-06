package Lista0;

import java.util.Scanner;

public class Ex7_TrocaDeValores {


		public static void main(String[] args) {
			float varA, varB, temp;
			Scanner s = new Scanner(System.in);

			System.out.print("Digite o valor da variavel A:");
			varA = s.nextFloat();

			System.out.print("Digite o valor da variavel B:");
			varB = s.nextFloat();

			System.out.println("Antes - A:" + varA + " B:" + varB);

			temp = varA;
			varA = varB;
			varB = temp;

			System.out.printf("Depois - A:" + varA + " B:" + varB);

			s.close();

		

	}
}
