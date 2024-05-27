package aulas;
import java.util.Scanner;

public class exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero,sucessor,antecessor;
		//Entrada de dados
		System.out.println("Digite um número");
		numero = ler.nextInt();
		//processamento condição composta
		sucessor = numero+1;
		antecessor = numero-1;
	    // saida 
		System.out.println("Sucessor:" + sucessor);
		System.out.println("Antecessor: " + antecessor);


}
}
