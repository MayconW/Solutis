package Lista02;

import java.util.Scanner;

public class Ex11_Ordenar {

	public static void main(String[] args) {

		int comparacao, tamanhoPalavra1, tamanhoPalavra2;
		String palavra1, palavra2;

		Scanner s = new Scanner(System.in);

		System.out.print("Digite a primeira palavra: ");
		palavra1 = s.nextLine();

		System.out.print("Digite a segunda palavra: ");
		palavra2 = s.nextLine();

		comparacao = palavra1.compareTo(palavra2);

		if (comparacao < 0) {
			System.out.println("Palavras em ordem alfabetica: " + palavra1 + " - " + palavra2);
		} else if (comparacao > 0) {
			System.out.println("Palavras em ordem alfabetica: " + palavra2 + " - " + palavra1);
		} else {
			System.out.println("As palavras são iguais.");
		}

		tamanhoPalavra1 = palavra1.length();
		tamanhoPalavra2 = palavra2.length();

		if (tamanhoPalavra1 > tamanhoPalavra2) {
			System.out.println("A primeira palavra ( " + palavra1 + " ) tem o maior numero de caracteres. ( "
					+ tamanhoPalavra1 + " )");
		} else if (tamanhoPalavra1 < tamanhoPalavra2) {
			System.out.println("A segunda palavra ( " + palavra2 + " ) tem o maior numero de caracteres. ( "
					+ tamanhoPalavra2 + " )");
		} else {
			System.out.println("As palavras " + palavra1 + " e " + palavra2 + "  possui o mesmo numero de caracteres.");
		}
		s.close();
	}

}
