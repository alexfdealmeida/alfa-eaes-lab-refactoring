package formTemplateMethod;

public class ContaPF extends Conta {    

    public ContaPF(String titular, double saldoInicial) {
		super(titular, saldoInicial);		
	}
    
    @Override
    public double getTaxa() {
    	return 0.1;
    }

}