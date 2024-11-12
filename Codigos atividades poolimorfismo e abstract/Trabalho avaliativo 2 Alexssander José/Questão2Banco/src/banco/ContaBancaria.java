package banco;



/**
 *
 * @author Alexssander
 */
public class ContaBancaria {
    private String titular;
    private double saldo;
    private double rendaMensal;
    
    
    public ContaBancaria(String titular, double saldo, double rendaMensal) {
        if(titular.equals("")){
            this.titular="não identificado";
        }else{
            this.titular = titular;
        }
       
        this.saldo = saldo;
        if(rendaMensal>=2824){
            this.rendaMensal = rendaMensal; 
        }else{
            this.rendaMensal=2824;
        }
       
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRendaMensal() {
        return rendaMensal;
    }
    
    public void depositar(double montante){
        this.saldo+=montante;
        verificarSaldo();
    }
    public void sacar(double montante){
        if(montante>this.saldo){
            System.out.println("saldo insuficiente");
        }else{
            this.saldo=this.saldo-montante;
            System.out.println("saque efetuado com sucesso");
        }
        verificarSaldo();
    }
    public void verificarSaldo(){
        System.out.println("O saldo na conta de "+titular+" é: R$"+saldo+" Renda");
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
        
    }
    
    @Override
    public String toString(){
        return "ContaBancaria | titular : "+titular+" saldo : "+saldo+" rendaMensal : "+rendaMensal;
    }
    
    
    
}
    
        
    
    

