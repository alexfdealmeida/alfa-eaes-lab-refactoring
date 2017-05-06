package formTemplateMethod;

public abstract class Conta {
	
	private double saldo;
    private String titular;
    
    public abstract double getTaxa();

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }    

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }    
    
    public void saca(double valor) {
        saldo -= valor + getTaxa();
    }

    public void deposita(double valor) {
        saldo += valor - getTaxa();
    }
    
}
