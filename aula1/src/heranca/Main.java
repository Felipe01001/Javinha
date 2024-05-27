package heranca;

public class Main {

	public static void main(String[] args) {
		Cachorro cachorro = new Cachorro ("Tótó ");
		cachorro.fazerSom(); //Método da super classe 
		cachorro.latir(); //Chamando método da classe filha
		
	}

}
