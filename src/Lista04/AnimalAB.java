package Lista04;

public abstract class AnimalAB implements AnimalIF {

	private String nome, tipoAnimal, habitat;
	private int idade;

	public AnimalAB(String nome, String tipoAnimal, int idade, String habitat) {
		this.nome=nome;
		this.tipoAnimal = tipoAnimal;
		this.idade = idade;
		this.habitat = habitat;
	}

	public abstract void comer();

	public abstract void moverse();

	public abstract void dormir();
	
	
	
	 public abstract void comer(int quantidadeComida);
	 public abstract void moverse(int distancia);
	 public abstract void dormir(int horas);

	 
	 
	 

	public String getNome() {
		return nome;
	}
	
	public String getTipo() {
		return tipoAnimal;
	}
	public String getHabitat() {
		return habitat;
	}
	public int getIdade() {
		return idade;
	}

}
