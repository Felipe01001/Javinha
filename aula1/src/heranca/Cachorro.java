package heranca;

public class Cachorro extends Animal {

	public Cachorro(String nome) {
		super (nome);	
		}
	public void latir() {
		System.out.println(getNome() + "Está latindo: Uau Uau");
	}

}
