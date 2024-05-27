package Interface;

public class TesteCaixa {

	public static void main(String[] args) {
		ICaixaEletronico usuario = new CaixaEletronico();
		usuario.sacar(800);
	}

}
