package Lista04;

public class Main {
	
	public static void linhas() {
		
		System.out.println("---------- \n ");
	}
	public static void main(String[] args) {
		
		
		Cachorro Max = new Cachorro("Max", 1);
		Peixe Nemo = new Peixe("Nemo", 1, 4, 2.3);
		Leao Simba = new Leao("Simba", 5 );
		
		Pombo Pru = new Pombo ("Pruu", 1, 2, 0.3, 0.5);
		
		
		linhas();
		Simba.dormir(5);
		Simba.comer(30);
		Simba.moverse(10);
		
		linhas();
		Max.comer(5);
		Max.moverse();
		Max.dormir();
		Max.comer();
		
		linhas();
		Nemo.moverse();
		
		
		linhas();
		Pru.voar();
	}

}
