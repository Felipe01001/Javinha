package FiguraGeometrica;

public class Main {

	public static void main(String[] args) {
		Figura f1 = new Quadrado (4);
		
		Figura f2 = new Circulo (2);
		
		System.out.println ("Area da Figura 1 é: " + f1.calcularArea() + " \n" + "Area da Figura 2 é: " + f2.calcularArea());

	}

}
