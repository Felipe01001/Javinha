package aulas;

import java.util.Scanner;

public class CalculadoraPotencia{

    // Método estático para calcular a potência de um número
    public static double calcularPotencia(double base, double expoente) {
        return Math.pow(base, expoente);
    }

    // Método estático para calcular a potência cúbica de um número
    public static double calcularPotenciaCubica(double base) {
        return Math.pow(base, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que informe o número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        // Calcular a potência de 2 e a potência cúbica
        double potencia = calcularPotencia(numero, 2);
        double potenciaCubica = calcularPotenciaCubica(numero);

        // Exibir os resultados
        System.out.println("A potência de " + numero + " elevado a 2 é: " + potencia);
        System.out.println("A potência cúbica de " + numero + " é: " + potenciaCubica);

        scanner.close();
    }
}
