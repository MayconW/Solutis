package Lista0;

import java.util.Scanner;

public class Ex11_Codigos {

	static String encontra_produto(int resposta) {

		if (resposta == 001) {
			return "Parafuso";

		} else if (resposta == 002) {
			return "Porca";

		} else if (resposta == 003) {
			return "Prego";

		} else {
			return "Diversos";

		}

	}

	public static void main(String[] args) {

		int resposta;
		Scanner s = new Scanner(System.in);
		System.out.print("Digite o valor desejado:");
		resposta = s.nextInt();

		System.out.println("Produto: " + encontra_produto(resposta));
		
		s.close();
	}
}
