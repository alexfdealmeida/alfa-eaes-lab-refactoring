package replaceTempWithQuery;

public class Produto {
	private int quantidade;
	private int precoItem;
	private final double fatorDesconto95 = 0.95;
	private final double fatorDesconto98 = 0.98;

	double getPreco() {		
		double fatorDesconto = calcularPrecoBase() > 1000 ? fatorDesconto95 : fatorDesconto98;		
		return calcularPrecoBase() * fatorDesconto;
	}

	private int calcularPrecoBase() {		
		return quantidade * precoItem;
	}
}
