package ExercicioHeranca;

public class ContaEspecial extends ContaBancaria {
	private float limite;

	public ContaEspecial(String cliente, int num_conta, float saldo, int limite) {
		super (cliente, num_conta,saldo);
		this.limite = limite;
		
	}

}
