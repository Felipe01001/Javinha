package aulas;

import java.util.Scanner;

public class ManipuladorNumeros{

    // Método estático para calcular o dobro
    public static double calcularDobro(double numero) {
        return numero*2;
    }

    // Método estático para calcular o triplo
    public static double calcularTriplo(double numero) {
        return numero*3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir ao usuário que informe o número
        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double dobro = calcularDobro(numero);
        double triplo = calcularTriplo(numero);

        // Exibir os resultados
        System.out.println("O Dobro é:  " + dobro);
        System.out.println("O Triplo é: " + triplo);

        scanner.close();
    }
}
