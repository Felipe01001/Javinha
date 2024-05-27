package FiguraGeometrica;

	public class Quadrado extends Figura {
		double lado;
		public Quadrado (double lado) {
			this.lado = lado;
		}
			public double calcularArea() {
				double area = 0;
				area = lado * lado;
				return area;
			}
		}


