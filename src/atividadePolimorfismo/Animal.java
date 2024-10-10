package atividadePolimorfismo;

public class Animal {
	private String nome;
	private String familia;
	
	
	public Animal(String nome, String familia) {
		this.nome = nome;
		this.familia = familia;
	}
	public void fazerSom() {
		System.out.println("....");
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFamilia() {
		return familia;
	}
	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	


}
