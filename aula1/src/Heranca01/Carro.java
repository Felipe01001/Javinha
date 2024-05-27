package Heranca01;

public class Carro extends Veiculo{
	private int numPortas;
	public Carro(String marca, String modelo, int numPortas) {
		// TODO Auto-generated constructor stub
		super (marca, modelo);
		this.numPortas = numPortas;
	}
	
	public void ligarFarol() {
		System.out.println("O farol está ligado.");
	}
}
