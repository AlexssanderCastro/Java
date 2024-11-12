package aulaherança;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) {
        Funcionario joao = new Funcionario();
        joao.setPrimeiroNome("João");
        joao.setSegundoNome("Pires");
        joao.setSalario(900.00);
        
        FuncionarioComissionado maria = new FuncionarioComissionado();
        maria.setPrimeiroNome("Maria");
        maria.setSegundoNome("Silva");
        maria.setSalario(1000.00);
        maria.setComissao(50.00);
        maria.setVendas(10);
        
        /****************************************************/
        
        System.out.println("Funcionário fixo: " + joao.getPrimeiroNome()
            + " " + joao.getSegundoNome() + "\nSalário R$: " + joao.getSalario());
        
        /****************************************************/
        
        System.out.println("****************************************************");
        System.out.println("Funcionário Comissionado: \nNome: " + maria.getPrimeiroNome()
            + " " + maria.getSegundoNome() + "\nSalário fixo R$: " + maria.getSalario());
        System.out.println("Salário com comissão: R$ " + maria.calcularPagamentoTotal());
        maria.adicionarVendas(5);
        System.out.println("Salário com comissão + 5: R$ " + maria.calcularPagamentoTotal());
        
        
    }
    
}
