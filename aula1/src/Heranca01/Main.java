package Heranca01;

public class Main {

	public static void main(String[] args) {
		Carro meucarro = new Carro ("Fiat", "Uno", 2);
		Moto minhamoto = new Moto ("Honda", "Start", 160);
		
		meucarro.acelerar();
		meucarro.ligarFarol();
		meucarro.freiar();
		
		minhamoto.acelerar();
		minhamoto.empinar();
		
		
		
	}

}
