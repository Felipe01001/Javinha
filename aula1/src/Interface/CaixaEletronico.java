package Interface;

public class CaixaEletronico implements ICaixaEletronico {

	@Override
	public void sacar(float valor) {
		System.out.println("Vou sacar: R$ " + valor);
	}
	
	

}
