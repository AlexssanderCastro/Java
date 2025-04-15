package aulaherançaconstrutor;

/**
 *
 * @author Alexssander
 */
public class FuncionarioComissionado extends Funcionario{
    
    private double comissao;
    private int vendas;

    
    public FuncionarioComissionado(String primeiroNome, String segundoNome, double salario, double comissao, int vendas){
        super(primeiroNome,segundoNome,salario);
        
        this.comissao=comissao;
        this.vendas=vendas;
    }

    public double getComissao() {
        return comissao;
    }

    public int getVendas() {
        return vendas;
    }
    public void adicionarVendas(int vendas){
      
        this.vendas+=vendas;
        
    }
    
    public void zerarVendas(){
        this.vendas=0;
    }
    
    public double calcularPagamentoTotal(){
        double pagamento = (this.vendas*this.comissao)+super.getSalario();
        return pagamento;
    } 
        
}
