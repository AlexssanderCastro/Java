package aulaherança;

/**
 *
 * @author Alexssander
 */
public class Principal {

  
    public static void main(String[] args) {
        Funcionario joao = new Funcionario();
        joao.setPrimeiroNome("João");
        joao.setSegundoNome("Pires");
        joao.setSalario(900.00);
        
        FuncionarioComissionado maria=new FuncionarioComissionado();
        maria.setPrimeiroNome("Maria");
        maria.setSegundoNome("Silva");
        maria.setSalario(1000);
        maria.setComissao(50);
        maria.setVendas(10);
        
        /***********************************************************************/
        
        
        System.out.println("Funcionario fixo: "+joao.getPrimeiroNome()+" "+joao.getSegundoNome()+"\n"+"Salario: R$"+joao.getSalario());
        
         
        /***********************************************************************/
        System.out.println("/***********************************************************************/");
        System.out.println("Funcionario comissionado dia 5: \nNome: "+maria.getPrimeiroNome()+" "+maria.getSegundoNome()+"\nSalario fixo: R$"+maria.getSalario()+"\nPagamento com comissão: R$"+maria.calcularPagamentoTotal());
        
        maria.adicionarVendas(5);
        System.out.println("/***********************************************************************/");
        System.out.println("Pagamento com comissão: R$"+maria.calcularPagamentoTotal());
        
        System.out.println("/***********************************************************************/");
        maria.zerarVendas();
        System.out.println("Pagamento com comissão: R$"+maria.calcularPagamentoTotal());
        
        maria.adicionarVendas(25);
        System.out.println("/***********************************************************************/");
        System.out.println("Pagamento com comissão: R$"+maria.calcularPagamentoTotal());
        
    }
    
}
