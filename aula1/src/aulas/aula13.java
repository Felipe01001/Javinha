package aulas;

public class aula13 {

	public aula13() {
		// TODO Auto-generated constructor stub
	}
	public static void ModificaString (StringBuilder frase) {
		frase.append(", Mundo.");
		System.out.println("Dentro do método: " + frase);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder frase01 = new StringBuilder("Olá");
		StringBuilder frase02 = new StringBuilder("Tchau");
		System.out.println("Antes do método: " + frase01);
		ModificaString(frase01);
		System.out.println("Depois do método: " + frase01);
		System.out.println();
		System.out.println("Antes do método: " + frase02);
		ModificaString(frase02);
		System.out.println("Nova frase: " + frase02);

	}

}
