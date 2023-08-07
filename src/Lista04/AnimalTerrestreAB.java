package Lista04;

public abstract class AnimalTerrestreAB extends AnimalAB {

	 private int quantidadePatas;
	 private double altura, peso;
	 
	public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, int quantidadePatas, double altura, double peso) {
		super(nome, tipoAnimal, idade, habitat);
		// TODO Auto-generated constructor stub
		this.altura=altura;
		this.quantidadePatas=quantidadePatas;
		this.peso=peso;
	}

	public abstract void correr();
	
	@Override
	public void comer() {
		// TODO Auto-generated method stub

	}

	public int getQuantidadePatas() {
		return quantidadePatas;
	}

	public void setQuantidadePatas(int quantidadePatas) {
		this.quantidadePatas = quantidadePatas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public void moverse() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub

	}

}
