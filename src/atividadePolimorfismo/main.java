package atividadePolimorfismo;

public class main {

	public static void main(String[] args) {
		Cachorro dog = new Cachorro("Thor", "silva", "Pastor-alemao" );
		Gato cat = new Gato("Mel", "", "Siames");
		
		System.out.println("===========================================");
		dog.fazerSom();
		System.out.println("gato:");
		cat.fazerSom();
	}

}
