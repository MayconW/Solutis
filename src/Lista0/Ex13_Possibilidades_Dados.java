package Lista0;

public class Ex13_Possibilidades_Dados {

	public static void main(String[] args) {

		for (int dado1 = 1; dado1 <= 6; dado1++) {
			int dado2 = 7 - dado1;
			if (dado2 >= 1 && dado2 <= 6) {
				System.out.println("Combinacao: Dado1 = " + dado1 + ", Dado2 = " + dado2);
			}
		}
	}
}
