package Lista02;

import java.util.Scanner;

public class Ex12_CalcularConsumo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int totalQuilometros = 0, totalLitros = 0, numeroTanque = 1, quilometros, litros;
		double consumoPorLitro, consumoMedioTotal;

		System.out.println("Digite os dados de cada tanque cheio (-1 para finalizar o programa!):");

		while (true) {
			System.out.print("Quilometros dirigidos com o tanque: " + numeroTanque + ": ");
			quilometros = s.nextInt();

			if (quilometros == -1) {
				break;
			}

			System.out.print("Litros de gasolina consumidos com o tanque: " + numeroTanque + ": ");
			litros = s.nextInt();

			consumoPorLitro = (double) quilometros / litros;
			System.out.println("Consumo do tanque " + numeroTanque + ": " + consumoPorLitro + " km/l");

			totalQuilometros += quilometros;
			totalLitros += litros;
			numeroTanque++;
		}

		if (numeroTanque > 1) {
			consumoMedioTotal = (double) totalQuilometros / totalLitros;
			System.out.println("\n--Consumo--");
			System.out.println("\nConsumo medio: " + consumoMedioTotal + " km/l");
			System.out.println("Quilometragem total: " + totalQuilometros + " km");
			System.out.println("Litros totais de gasolina consumidos: " + totalLitros + " litros");
		} else {
			System.out.println("Nao foram registrados dados de tanque cheio.");
		}

		s.close();

	}

}
