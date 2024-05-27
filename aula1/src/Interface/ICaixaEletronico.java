package Interface;

public interface ICaixaEletronico {
	
	void sacar (float valor);
	default void verificaFraude() {
		System.out.println("Verificação de fraude iniciada");
		
		
	}
}
