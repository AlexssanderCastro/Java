package aulaherancaconstrutor;

/**
 *
 * @author Ligia
 */
public class FuncionarioComissionado extends Funcionario
{
    private double comissao;
    private int vendas;
    
    
   public FuncionarioComissionado
        (String primeiroNome, String segundoNome, double salario, 
                double comissao, int vendas)
   {
       super(primeiroNome, segundoNome, salario);
       this.comissao = comissao;
       this.vendas = vendas;
   }

    public double getComissao() {
        return comissao;
    }

    public int getVendas() {
        return vendas;
    }
}
