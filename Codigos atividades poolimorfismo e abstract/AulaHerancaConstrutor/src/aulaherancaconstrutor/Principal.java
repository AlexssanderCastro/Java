
package aulaherancaconstrutor;

/**
 *
 * @author Ligia
 */
public class Principal {

    public static void main(String[] args) 
    {
        Funcionario carlos = new Funcionario("Carlos", "Maranhão", 200.00);
        FuncionarioComissionado joana = 
                new FuncionarioComissionado("Joana", "Cardoso", 1000.00, 10.00, 2);
    }
    
}
