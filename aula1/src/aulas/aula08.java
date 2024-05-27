package aulas;
import java.util.Scanner;


public class aula08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaração de variaveis 
		double valorTotal;
		int codigo,continuar;
		double desconto = 0;
		double valorFinal;
		// entrada de dados 
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite o valor total da compra:");
		valorTotal = ler.nextDouble();
		System.out.println("Digite o codigo do cliete: (1 - comum)--(2 - funcionario)--(3 - vip)");
		codigo = ler.nextInt();
		// Estrututa de multipla seleção
		switch (codigo) {
		case 1: desconto = 0;
		System.out.println("Não houve desconto!!");
		break;
		case 2: desconto = 0.1;
		System.out.println("Houve desconto.");
		break;
		case 3: desconto = 0.2;
		System.out.println("Houve desconto.");
		break;
		default: System.out.println("Valor inválido");
		}
		valorFinal = valorTotal - (valorTotal*desconto);
		// Saída de dados
		System.out.println("Valor final R$ " +valorFinal);
	
		

	}

}
