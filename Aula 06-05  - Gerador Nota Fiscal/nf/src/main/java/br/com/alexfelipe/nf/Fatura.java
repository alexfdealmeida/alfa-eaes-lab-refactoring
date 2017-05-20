package br.com.alexfelipe.nf;

public class Fatura {
	private String n;
	private double v;

	public Fatura(String n, double v){
		this.n = n;
		this.v = v;
	}
	public String getN() {
		return n;
	}

	public void setN(String n) {
		this.n = n;
	}

	public double getV() {
		return v;
	}

	public void setV(double v) {
		this.v = v;
	}

}
