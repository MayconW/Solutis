package Lista04;

public abstract class AnimalMarinhoAB extends AnimalAB {

	
	private int quantidadeNadadeiras;
	double comprimento;
	
	
	public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadeNadadeiras, double comprimento) {
		super(nome, tipoAnimal, idade, habitat);
		// TODO Auto-generated constructor stub
		this.comprimento=comprimento;
		this.quantidadeNadadeiras=quantidadeNadadeiras;
		
	}

	public abstract void nadar();
	
	public int getQuantidadeNadadeiras() {
		return quantidadeNadadeiras;
	}

	public void setQuantidadeNadadeiras(int quantidadeNadadeiras) {
		this.quantidadeNadadeiras = quantidadeNadadeiras;
	}


	public double getComprimento() {
		return comprimento;
	}


	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	
	
	

}
