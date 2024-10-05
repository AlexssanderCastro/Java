package contaBancária;

/**
 *
 * @author Alexssander
 */
public class Conta {
    private double saldo;
    private String titular;
    
    
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
     
    public void deposito(double v){
        this.saldo+=v;
        
    }
    public void saque(double v){
        this.saldo-=v;
        
    }
    
    
    
}
