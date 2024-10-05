package contaBancária;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        Conta conta1=new Conta();
        
        conta1.setSaldo(1000);
        conta1.setTitular("João Francisco de Souza");
        conta1.saque(50);
        conta1.deposito(800);
        
        System.out.println("O saldo final de " + conta1.getTitular() + " é de R$" + conta1.getSaldo());
        
        
        
        
    }
}