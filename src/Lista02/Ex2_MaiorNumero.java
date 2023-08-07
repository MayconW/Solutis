package Lista02;

import java.util.Scanner;

public class Ex2_MaiorNumero {

	public static void main(String[] args) {

		double valorA, valorB;

		Scanner s = new Scanner(System.in);

		System.out.print("Digite o primeiro valor: ");
		valorA = s.nextDouble();

		System.out.print("Digite o primeiro valor: ");
		valorB = s.nextDouble();

		if (valorA > valorB) {
			System.out.print("Maior valor entre: " + valorA + " e " + valorB + " e: " + valorA);
		} else if (valorA < valorB) {
			System.out.print("Maior valor entre: " + valorA + " e " + valorB + " e: " + valorB);
		} else {
			System.out.print("Os valores " + valorA + " e " + valorB + " sao iguais!");
		}
		
		s.close();
	}

}
