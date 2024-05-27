package aulas;

import java.util.Scanner;

public class CalculadoraDesconto{

    
    public static double calcularDesconto(double numero, double desconto) {
        return numero-desconto;
    }

    
    public static double calcularDescontoPercentual(double numero, double percentual) {
        double desconto = (percentual/100)*numero;
    	return numero-desconto;
    	
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que informe o número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();
        
     // Pedir ao usuário que informe o desconto
        System.out.print("Digite um desconto: ");
        double desconto = scanner.nextDouble();
        
     // Pedir ao usuário que informe o percentual
        System.out.print("Digite um percentual: ");
        double percentual = scanner.nextDouble();

        

        // Exibir os resultados
        System.out.println("Valor com desconto:  " + calcularDesconto(numero,desconto));
        System.out.println("Valor com desconto percentual:  " + calcularDescontoPercentual(numero,percentual));

       

        scanner.close();
    }
}
