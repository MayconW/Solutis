package Lista0;

import java.util.Scanner;

public class Ex14_While {

	public static void main(String[] args) {
	
		int contador=1;
		double soma=0;
		
		Scanner s = new Scanner(System.in);
		
		
		while(contador<=50) {
			System.out.print("Digite o " +contador + "o valor:");
			soma+=s.nextDouble();
			contador++;
		}
		
		System.out.println("Media dos 50 valores lidos: " + (double) soma/(contador-1));
		
		
		s.close();
		
	}

}

