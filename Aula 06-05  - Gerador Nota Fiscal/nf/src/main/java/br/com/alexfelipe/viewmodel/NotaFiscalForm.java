package br.com.alexfelipe.viewmodel;

import br.com.alexfelipe.nf.NotaFiscal;

public class NotaFiscalForm {
	private NotaFiscal notaFiscal = new NotaFiscal(0,0);
    private String nomeCliente;
    private String tipoImposto;
    private Double valorFatura;
    public NotaFiscal getNotaFiscal() {
        return notaFiscal;
    }
 
    public void setNotaFiscalr(NotaFiscal notaFiscal) {
        this.notaFiscal = notaFiscal;
    }
 
    public String getNomeCliente() {
        return nomeCliente;
    }
 
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    
    public Double getValorFatura() {
        return valorFatura;
    }
 
    public void setTipoImposto(String tipoImposto) {
        this.tipoImposto = tipoImposto;
    }
    
    public String getTipoImposto() {
        return tipoImposto;
    }
 
    public void setValorFatura(Double valorFatura) {
        this.valorFatura = valorFatura;
    }
}
