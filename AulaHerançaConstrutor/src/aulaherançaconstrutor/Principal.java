package aulaherançaconstrutor;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {

        Funcionario carlos=new Funcionario("Carlos","Maranhão",200.0);
        
        FuncionarioComissionado joana=new FuncionarioComissionado("Joana","Cardoso",1000.00,10.00,2);
        
        System.out.println("Funcionario fixo: "+carlos.getPrimeiroNome()+" "+carlos.getSegundoNome()+"\n"+"Salario: R$"+carlos.getSalario());
        
         
        /***********************************************************************/
        System.out.println("/***********************************************************************/");
        System.out.println("Funcionario comissionado dia 5: \nNome: "+joana.getPrimeiroNome()+" "+joana.getSegundoNome()+"\nSalario fixo: R$"+joana.getSalario()+"\nPagamento com comissão: R$"+joana.calcularPagamentoTotal());
        
        joana.adicionarVendas(10);
        System.out.println("/***********************************************************************/");
        System.out.println("Pagamento com comissão: R$"+joana.calcularPagamentoTotal());
        
        System.out.println("/***********************************************************************/");
        joana.zerarVendas();
        System.out.println("Pagamento com comissão: R$"+joana.calcularPagamentoTotal());
        
        joana.adicionarVendas(100);
        System.out.println("/***********************************************************************/");
        System.out.println("Pagamento com comissão: R$"+joana.calcularPagamentoTotal());
        
    }
    
}
