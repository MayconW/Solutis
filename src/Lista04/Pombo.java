package Lista04;

public class Pombo extends AnimalVoadorAB {

	private int horasDormidas=0, comidasIngeridas=0, distanciaPercorrida=0;
	
	public Pombo(String nome, String tipoAnimal, int idade, String habitat, int quantidadeAssas, double envergaduraAssa,
			double peso) {
		super(nome, tipoAnimal, idade, habitat, quantidadeAssas, envergaduraAssa, peso);
		// TODO Auto-generated constructor stub
	}
	public Pombo(String nome, int idade, int quantidadeAssas, double envergaduraAssa, double peso) {
		
		super(nome, "Pombo", idade, "Ar", quantidadeAssas, envergaduraAssa, peso );
	
	}

	public void voar() {
		
		System.out.println(getTipo() +" " +this.getNome() + " esta voando! ");
	}

	
	@Override
	public void comer(int quantidade) {

		this.comidasIngeridas+=quantidade;

		System.out.println(getTipo() +" " +this.getNome() + " quantidade de comida ingerida: " + comidasIngeridas);

	}
	 public void comer() {
	        // Valor padrão: 1
	        comer(1);
	    }
	 
	 
	 public void moverse(int distancia) {
			this.distanciaPercorrida+=distancia;
				
			System.out.println(getTipo() +" " +this.getNome() +" Distancia percorrida: " + distanciaPercorrida);
		}
		public void moverse() {
			moverse(1);
		}

		@Override
		public void dormir(int horas) {

			this.horasDormidas+=horas;
			System.out.println(getTipo() +" " +this.getNome() +" Horas dormidas: " + horasDormidas);

		}
		public void dormir() {
			dormir(1);
			
		}

	public int getHorasDormidas() {
		return horasDormidas;
	}

	public void setHorasDormidas(int horasDormidas) {
		this.horasDormidas = horasDormidas;
	}

	public int getComidasIngeridas() {
		return comidasIngeridas;
	}

	public void setComidasIngeridas(int comidasIngeridas) {
		this.comidasIngeridas = comidasIngeridas;
	}

	public int getDistanciaPercorrida() {
		return distanciaPercorrida;
	}

	public void setDistanciaPercorrida(int distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}

}
