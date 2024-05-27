package Heranca01;

public class Moto extends Veiculo {
	private int cilindradas;
	
	public Moto(String marca, String modelo, int cilindradas) {
		super (marca, modelo);
		this.cilindradas = cilindradas;
	}
	
	public void empinar() {
		System.out.println("A moto está empinando.");
	}

}
