package aulas;
import java.util.Scanner;

public class exercicioSwitch01 {

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        
	        System.out.println("Informe o código do produto:");
	        int opcao = ler.nextInt();

	        switch(opcao) {
	            case 1:
	                System.out.println("Alimento não-perecìvel");
	                break;
	            case 2:
	                System.out.println("Alimento perecível");
	                break;
	            case 3:
	                System.out.println("Vestuário");
	                break;
	            case 4:
	                System.out.println("Limpeza");
	                break;
	            default:
	                System.out.println("Opção inválida");
	                break;
	        }

	        ler.close();
	    }
	}