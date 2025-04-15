package banco;

/**
 *
 * @author Alexssander
 */
public class ContaPouPanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPouPanca(double taxaJuros, String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
        if(taxaJuros<0.6 || taxaJuros>2.8){
            this.taxaJuros=1.7;
        }else{
            this.taxaJuros = taxaJuros; 
        }
       
    }
    
    
    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    
    public void aplicarJuros(){
        super.depositar(super.getSaldo()*(taxaJuros/100));
    }
    
    @Override
    public String toString(){
        return "ContaPouPanca | titular : "+getTitular()+" saldo : "+getSaldo()+" rendaMensal : "+getRendaMensal()+" taxaJuros : "+taxaJuros;
    }
    
}
