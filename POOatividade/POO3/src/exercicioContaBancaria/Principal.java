package exercicioContaBancaria;
import java.util.Scanner;

/**
 *
 * @author IFTM
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op=1;
        ContaBancária cliente= new ContaBancária();
        System.out.println("Digite seu nome:");    
        cliente.titular = sc.nextLine();
        System.out.println("Digite seu saldo:");
        cliente.saldo = sc.nextDouble();
        
        while(op!=0){          
            System.out.println("Qual operação você deseja realizar:");
            System.out.println("Digite 0 para finalizar");
            System.out.println("Digite 1 para sacar");
            System.out.println("Digite 2 para depositar");
            System.out.println("Digite 3 para ver saldo");
            op=sc.nextInt();
            if(op==1){
               cliente.sacar();
            }else if(op==2){
                cliente.depositar();
            }else if(op==3){
                cliente.exibirSaldo();
            }
            
        }
        
        sc.close();
        
    }
    
}
