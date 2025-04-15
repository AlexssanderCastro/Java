package banco;

/**
 *
 * @author Alexssander
 */
public class ContaCorrente extends ContaBancaria{
    private double limiteEspecial;

    public ContaCorrente(double limiteEspecial, String titular, double saldo, double rendaMensal) {
        super(titular, saldo, rendaMensal);
        if(limiteEspecial>0.4*super.getRendaMensal()){
            this.limiteEspecial=0.4*super.getRendaMensal();
        }else{
            this.limiteEspecial = limiteEspecial; 
        }
       
    }

    public double getLimiteEspecial() {
        return limiteEspecial;
    }
    
    @Override
    public void sacar(double montante){
        if(montante>limiteEspecial && montante<limiteEspecial+getSaldo()){
            setSaldo(getSaldo()- montante);
            System.out.println("Saque efetuado com sucesso");
            
        }else{
            System.out.println("Não foi possivel realizar o saque");
        }
        verificarSaldo();
    }
    
    @Override
    public String toString(){
        return "ContaCorrente | titular : "+getTitular()+" saldo : "+getSaldo()+" rendaMensal : "+getRendaMensal()+" limiteEspecial : "+limiteEspecial;
    }
    
    
    
    
}
