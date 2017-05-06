package extractMethod;

import java.util.ArrayList;

public class Divida {
	private Pedidos pedidos;
	private String nome;

	void imprimeDivida() {
		ImprimirCabecalho();
		// calcula d�vidas
		double divida = calculaDivida();
		imprimeDetalhes(divida);
	}

	private void imprimeDetalhes(double divida) {
		// imprime detalhes
		System.out.println("nome: " + nome);
		System.out.println("divida total: " + divida);
	}

	private double calculaDivida() {
		double divida = 0.0;
		int i = 0;
		ArrayList<Itens> e = pedidos.getPedidos();
		while (i < e.size()) {
			Itens cada = (Itens) e.get(i);
			divida += cada.getValor();
		}
		return divida;
	}

	private void ImprimirCabecalho() {
		// imprime cabe�alho
		System.out.println("***************************");
		System.out.println("*** D�vidas do Cliente ****");
		System.out.println("***************************");
	}
}
