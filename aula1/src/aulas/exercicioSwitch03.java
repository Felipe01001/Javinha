package aulas;

import java.util.Scanner;
		
		public class exercicioSwitch03 {

			    public static void main(String[] args) {
			        Scanner ler = new Scanner(System.in);
			        
			        System.out.println("Escolha uma opção entre 1 e 12: ");
			        int opcao = ler.nextInt();

			        switch(opcao) {
			            case 1:
			                System.out.println("Janeiro tem 31 dias");
			                break;
			            case 2:
			                System.out.println("Fevereiro tem 28 dias");
			                break;
			            case 3:
			                System.out.println("Março tem 31 dias");
			                break;
			            case 4:
			                System.out.println("Abril tem 330 dias");
			                break;
			            case 5:
			                System.out.println("Maio tem 31 dias");
			                break;
			            case 6:
			                System.out.println("Junho tem 30 dias");
			                break;
			            case 7:
			            	System.out.println("julho tem 31 dias");
			            	break;
			            case 8:
			            	System.out.println("agosto tem 31 dias");
			            	break;
			            case 9:
			            	System.out.println("setembo tem 30 dias");
			            	break;
			            case 10:
			            	System.out.println("outubro tem 31 dias");
			            	break;
			            case 11:
			            	System.out.println("novembro tem 30 dias");
			            	break;
			            case 12:
			            	System.out.println("dezembro tem 31 dias");
			            	break;
			            default:
			                System.out.println("Opção inválida");
			                break;
			        }

			        ler.close();
			    }
			}
	


