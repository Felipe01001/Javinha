package ExercicioHeranca;

public class ContaBancaria {
	private String cliente;
	private int num_conta;
	private float saldo;
	
	public ContaBancaria(String cliente, int num_conta, float saldo) {
			this.cliente = cliente;
			this.num_conta = num_conta;
			this.saldo = saldo;
			}
	public void sacar() {
		System.out.println("Sacou dinheiro.");
	}
	
	public void depositar() {
		System.out.println("Depositou dinheiro");
	}
}
