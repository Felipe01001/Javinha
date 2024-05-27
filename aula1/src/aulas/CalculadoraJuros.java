package aulas;

import java.util.Scanner;

public class CalculadoraJuros{

    
    public static double calcularJurosSimples(double numero, double taxa, int meses) {
        double desconto = ((numero*taxa)/100);
    	double montante = desconto*meses;
    	return montante;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que informe o número
        System.out.print("Digite um valor: ");
        double numero = scanner.nextDouble();
        
     // Pedir ao usuário que informe o desconto
        System.out.print("Digite a taxa: ");
        double taxa = scanner.nextDouble();
        
     // Pedir ao usuário que informe o percentual
        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        

        // Exibir os resultados
        System.out.println("Valor do montante após "+meses+ " meses: " + calcularJurosSimples(numero,taxa,meses));
       // System.out.println("Valor com desconto percentual:  " + calcularJurosCompostos(numero,taxa,meses));

       

        scanner.close();
    }
}
