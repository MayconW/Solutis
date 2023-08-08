package Lista04;

public class Cachorro extends AnimalAB {

		private int horasDormidas=0, comidasIngeridas=0, distanciaPercorrida=0;

	public Cachorro(String nome, String tipoAnimal, int idade, String habitat, int quantidedePatas) {
		super(nome, tipoAnimal, idade, habitat);
	

	}
	public Cachorro(String nome, int idade) {
		
		super(nome, "Cachorro", idade, "Terrestre");
	
	}
	@Override
	
	public void comer(int quantidade) {

		this.comidasIngeridas+=quantidade;

		System.out.println(getTipo() +" " +this.getNome() + " quantidade de racao ingerida: " + comidasIngeridas);

	}
	@Override
	
	 public void comer() {
	        // Valor padrão: 1
	        comer(1);
	    }
	
	 @Override
	 
	public void moverse(int distancia) {
		this.distanciaPercorrida+=distancia;
		System.out.println(getTipo() +" " +this.getNome() +" Distancia percorrida: " + distanciaPercorrida);
	}
	@Override
	
	public void moverse() {
		moverse(1);
	}

	@Override
	public void dormir(int horas) {

		this.horasDormidas+=horas;
		System.out.println(getTipo() +" " +this.getNome() +" Horas dormidas: " + horasDormidas);

	}
	@Override
	
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
