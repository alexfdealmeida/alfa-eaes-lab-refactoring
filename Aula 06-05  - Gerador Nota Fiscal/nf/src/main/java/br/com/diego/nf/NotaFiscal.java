package br.com.diego.nf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private double i;
	private double vb;
	
	public NotaFiscal() {
		
	}

	public NotaFiscal(double i, double vb) {
		this.i = i;
		this.vb = vb;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getI() {
		return i;
	}

	public void setI(double i) {
		this.i = i;
	}

	public double getVb() {
		return vb;
	}

	public void setVb(double vb) {
		this.vb = vb;
	}
	
	public double valorTotal() {
		return this.getVb() + this.getI();
	}

}
