package aulas;
//chamada de leitura pelo teclado
import java.util.Scanner;
public class exercicio{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cria a variavel de leitura 
		Scanner ler = new Scanner(System.in);
		int idade,mes,dia,total;
		//Entrada de dados
		System.out.println("Digite sua idade");
		idade = ler.nextInt();
		System.out.println("Digite o mês de aniversario");
		mes = ler.nextInt();
		System.out.println("Digite o dia do seu aniversario");
		dia = ler.nextInt();
	
		//processamento condição composta
		idade = idade*365;
		mes = mes*30;
		total = (idade+mes+dia);
	    // saida 
		System.out.println("Total de dias vividos " + total);


}
}
