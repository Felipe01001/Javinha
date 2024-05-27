package aulas;

import java.util.Scanner;

public class exercicioSwitch02 {

	public static void main(String[] args) {
		//declaração de variaveis
		char letra; 
		//leitura da variavel pelo teclado
		Scanner ler = new Scanner (System.in);
		//Exibir mensagem na tela 
		System.out.println("Escreva qualquer letra");
		//Leitura de variavel genero pelo teclado
		letra = ler.next().charAt(0);
		switch (letra) {
		case 'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U': System.out.println("Vogal");
		break;
		
		default: System.out.println("Consoante");
		}

	}

}


