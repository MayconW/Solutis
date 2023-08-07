package Lista02;


import java.util.Scanner;

public class Ex9_AreaCirculo {

	
	public static void main(String[] args) {
	
		double  raio, area;
		
		Scanner s = new Scanner(System.in);
	
		System.out.print("Digite o valor do raio:");
		
		raio=s.nextDouble();
		
		//utilizando o Math.round() pra arredondar;
		
		area = Math.round(Math.PI * Math.pow(raio, 2));
		
		System.out.println("Area do circulo: " + area);
		
		s.close();
	}
}
