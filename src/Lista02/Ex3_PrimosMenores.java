package Lista02;

import java.util.Scanner;

public class Ex3_PrimosMenores {

	public static boolean verifica_primo(int numero) {

		if (numero <= 1) {

			return false;
		}
		if (numero == 2) {

			return true;
		}
		if (numero % 2 == 0) {

			return false;
		}
		// a partir daqui sera verificado apenas para numeros impares para poupar
		// algumas comparações, pois numeros pares maiores do que 2 nao sao primos
		for (int i = 3; i <= Math.sqrt(numero); i += 2) {
			if (numero % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		int valor;

		Scanner s = new Scanner(System.in);
		System.out.print("Digite o numero: ");
		valor = s.nextInt();

		System.out.print("Numeros primos menores que " + valor + ": ");
		if (valor >= 2) {
			System.out.print("2" + " ");
		}
		for (int i = 3; i < valor; i += 2) {
			if (verifica_primo(i) == true) {
				System.out.print(i + " ");
			}
		}

		s.close();

	}
}
