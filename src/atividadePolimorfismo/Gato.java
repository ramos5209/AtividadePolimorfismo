package atividadePolimorfismo;

public class Gato extends Animal {
	
	private String raca;

	
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public void fazerSom() {
		System.out.println("miau miau");
	}
	
	

}
