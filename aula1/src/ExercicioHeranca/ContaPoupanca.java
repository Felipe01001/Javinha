package ExercicioHeranca;

public class ContaPoupanca extends ContaBancaria {
	private int rendimento;

	public ContaPoupanca(String cliente, int num_conta, float saldo, int rendimento) {
		super (cliente, num_conta,saldo);
		this.rendimento = rendimento;
		
	}
	
	public void calcularNovoSaldo() {
		System.out.println("Teste");
	}
	

}
