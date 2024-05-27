package aulas;
//chamada de leitura pelo teclado
import java.util.Scanner;
public class exercicio02{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cria a variavel de leitura 
		Scanner ler = new Scanner(System.in);
		double salario,reajuste;
		//Entrada de dados
		System.out.println("Digite seu salario: ");
		salario = ler.nextDouble();
		//processamento condição composta
		reajuste = (salario*0.01)+salario;
	    // saida 
		System.out.println("Salario com reajuste: R$ " + reajuste + " Reais");


}
}
