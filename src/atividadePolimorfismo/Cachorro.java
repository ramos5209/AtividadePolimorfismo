package atividadePolimorfismo;

public class Cachorro extends Animal {
	private String raca;
	

	public Cachorro(String nome, String familia, String raca) {
		super(nome, familia);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void fazerSom() {
		System.out.println("au au au");
	}
	
}
