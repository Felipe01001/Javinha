package aulas;
//chamada de leitura pelo teclado
import java.util.Scanner;
public class aula01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// cria a variavel de leitura 
		Scanner ler = new Scanner(System.in);
		float nota1, nota2, media;
		//Entrada de dados
		System.out.println("Digite a primeira nota:");
		nota1 = ler.nextFloat();
		System.out.println("Digite a segunda nota:");
		nota2 = ler.nextFloat();
		//processamento
		media = (nota1+nota2)/2;
		//saida
		System.out.println("A média das notas é " + media);

}
}
