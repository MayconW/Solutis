package Lista02;

import java.util.Scanner;

public class Ex5_DiasDaSemana {

	public static void main(String[] args) {

		String [] Dias = {"Domingo", "Segunda", "Terca", "Quarta", "Quinta", "Sexta", "Sabado"};
		int resposta;
		
		Scanner s = new Scanner(System.in);
		
		do {
			System.out.print("Digite o numero entre 1 a 7:");
			resposta=s.nextInt();
			
			if(resposta<1 || resposta>7) {
				System.out.println("Digite um valor valido entre 1 a 7!");
			}
		}while(resposta<1 || resposta>7);
		
		System.out.print("Dia da semana correspondente ao numero " +resposta +" = " + Dias[resposta-1]);
		
		s.close();

	}

}
