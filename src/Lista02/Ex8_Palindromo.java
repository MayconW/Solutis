package Lista02;

import java.util.Scanner;

public class Ex8_Palindromo {

	static void verifica_palindromo(String palavra) {
		palavra = palavra.replaceAll("\\s", "").toLowerCase();
		int esquerda = 0;
		int direita = palavra.length() - 1;

		while (esquerda < direita) {
			if (palavra.charAt(esquerda) != palavra.charAt(direita)) {
				System.out.println(palavra + " nao e um palindromo.");
				return;
			}
			esquerda++;
			direita--;
		}

		System.out.println(palavra + " e um palindromo.");
	}

	public static void main(String[] args) {

		String resposta;
		Scanner s = new Scanner(System.in);

		System.out.print("Digite a palavra: ");
		resposta = s.nextLine();

		verifica_palindromo(resposta);

		s.close();
	}

}
