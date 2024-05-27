package aulas;
import java.util.Scanner;

public class aula07 {

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        
	        System.out.println("Escolha uma opção entre 1 e 12: ");
	        int opcao = ler.nextInt();

	        switch(opcao) {
	            case 1:
	                System.out.println("Janeiro");
	                break;
	            case 2:
	                System.out.println("Fevereiro");
	                break;
	            case 3:
	                System.out.println("Março");
	                break;
	            case 4:
	                System.out.println("Abril");
	                break;
	            case 5:
	                System.out.println("Maio");
	                break;
	            case 6:
	                System.out.println("Junho");
	                break;
	            case 7:
	            	System.out.println("julho");
	            	break;
	            case 8:
	            	System.out.println("agosto");
	            	break;
	            case 9:
	            	System.out.println("setembo");
	            	break;
	            case 10:
	            	System.out.println("outubro");
	            	break;
	            case 11:
	            	System.out.println("novembro");
	            	break;
	            case 12:
	            	System.out.println("dezembro");
	            	break;
	            default:
	                System.out.println("Opção inválida");
	                break;
	        }

	        ler.close();
	    }
	}