package Lista0;

import java.util.Scanner;

public class Ex8_ImparOuPar {
	public static void main(String[] args) {
		int numero;
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor desejado:");
		numero = s.nextInt();

		if (numero % 2 == 0) {
			System.out.println("Numero " + numero + " e Par");
		} else {
			System.out.println("Numero " + numero + " e impar");
		}

		s.close();
	}

}
