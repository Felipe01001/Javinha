package aulas;
import java.util.*;

public class aula09 {

	public static void main(String[] args) {
		//declaração de variaveis
		char genero; 
		//leitura da variavel pelo teclado
		Scanner ler = new Scanner (System.in);
		//Exibir mensagem na tela 
		System.out.println("Digite o genero: M = masculino e F = feminino");
		//Leitura de variavel genero pelo teclado
		genero = ler.next().charAt(0);
		switch (genero) {
		case 'F', 'f': System.out.println("Feminino");
		break;
		case 'M','m': System.out.println("Masculino");
		break;
		case 'i','I': System.out.println("Indeciso");
		break;
		case 'j','J': System.out.println("JEFFERSON GAY");
		break;
		default: System.out.println("Genêro Inválido!!");
		}

	}

}
