package Lista0;

public class Ex12_ResultadoDivisao_3 {

	public static void main(String[] args) {
		int divisaoInt;
		double divisaoDouble;
		System.out.println("Resultado da divisao por 2 utilizando INT e Double");

		for (int i = 1; i <= 100; i += 2) {
			if (i % 3 == 0) {
				divisaoInt = (int) i / 2;
				divisaoDouble = (double) i / 2;
				System.out.println("Valor: " + i + "/2 - Int: " + divisaoInt + " Double: " + divisaoDouble);
			}
		}

	}

}
