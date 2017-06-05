package br.com.alexfelipe.nf;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NotaFiscal {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idNotaFiscal;
	private double imposto;
	private double valorBase;

	public NotaFiscal(double imposto, double valorBase) {
		this.imposto = imposto;
		this.valorBase = valorBase;
	}
	public NotaFiscal() {
		this.imposto = 0;
		this.valorBase = 0;
	}
	public int getIdNotaFiscal() {
		return idNotaFiscal;
	}

	public void setIdNotaFiscal(int idNotaFiscal) {
		this.idNotaFiscal = idNotaFiscal;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public double getValorBase() {
		return valorBase;
	}

	public void setValorBase(double valorBase) {
		this.valorBase = valorBase;
	}
	
	public double valorTotal() {
		return this.getValorBase() + this.getImposto();
	}

}
