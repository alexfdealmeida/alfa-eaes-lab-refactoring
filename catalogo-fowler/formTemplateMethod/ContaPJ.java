package formTemplateMethod;

public class ContaPJ extends Conta {

    public ContaPJ(String titular, double saldoInicial) {
		super(titular, saldoInicial);		
	}
    
    @Override
    public double getTaxa() {
    	return 0.2;
    }
}

