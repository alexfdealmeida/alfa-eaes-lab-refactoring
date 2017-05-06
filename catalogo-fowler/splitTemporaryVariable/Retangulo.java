package splitTemporaryVariable;

public class Retangulo {
	private double altura;
	private double largura;

	public void calcular() {
		calcularPerimetro();
				
		calcularArea();
	}

	private void calcularArea() {
		double area = altura * largura;
		System.out.println(area);
	}

	private void calcularPerimetro() {
		double perimetro = 2 * (altura + largura);
		System.out.println(perimetro);
	}
}
