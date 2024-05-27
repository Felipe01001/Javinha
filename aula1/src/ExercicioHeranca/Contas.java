package ExercicioHeranca;

public class Contas {

	public static void main(String[] args) {
		ContaPoupanca conta01 = new ContaPoupanca("Felipe", 001, 1000, 20);
		ContaEspecial conta02 = new ContaEspecial("Kennedy", 002, 1500, 50);
		conta01.sacar();
		conta01.depositar();
		
	}
	

}
