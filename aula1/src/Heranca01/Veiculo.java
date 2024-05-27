package Heranca01;

public class Veiculo {
	private String marca;
	private String modelo;

	public Veiculo(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}
 public void acelerar () {
	 System.out.println("O veículo está acelerando.");
 }
 public void freiar () {
	 System.out.println("O veículo está parado");
 }

}
