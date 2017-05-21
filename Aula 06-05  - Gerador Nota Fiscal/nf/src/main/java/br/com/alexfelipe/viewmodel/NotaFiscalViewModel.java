package br.com.alexfelipe.viewmodel;

import java.util.ArrayList;
import java.util.List;

import org.zkoss.zhtml.Messagebox;
import org.zkoss.zk.ui.util.Clients;

import br.com.alexfelipe.data.NotaFiscalData;
import br.com.alexfelipe.nf.*;

import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;

public class NotaFiscalViewModel extends NotaFiscalForm{
	private NotaFiscal selected;
    private List<NotaFiscal> notas;

    public List<NotaFiscal> getNotaFiscalList() {
        return notas;
    }

    public void recarregarNotaFiscalList() {
    	this.notas = new ArrayList<NotaFiscal>(new NotaFiscalData().getAll());
    }
    
    public void setSelectedNotaFiscal(NotaFiscal selected) {
        this.selected = selected;
    }
 
    public NotaFiscal getSelectedNotaFiscal() {
        return selected;
    }
	
    @Init
    public void init() {    
    	// Initialize
    	recarregarNotaFiscalList();
    }
    
    @Command
    @NotifyChange("notaFiscalList")
	public void onClickbtnGerarNotaFiscal() {
		Clients.showBusy("Gerando nota fiscal");
		try{
			Fatura fatura = new Fatura(this.getNomeCliente(), this.getValorFatura().doubleValue());
			Imposto imposto;

			if (this.getTipoImposto().toString().compareTo("1") == 0) {
				imposto = new ISS();
			} else {
				imposto = new ICMS();
			}
			new GeradorNotaFiscal().geraNota(fatura, imposto);
			recarregarNotaFiscalList();
			Messagebox.show("Nota Fiscal gerada com sucesso");
		}catch(Exception e){
			Messagebox.show(e.getMessage());
		}finally {
			Clients.clearBusy();
		}
	}
}