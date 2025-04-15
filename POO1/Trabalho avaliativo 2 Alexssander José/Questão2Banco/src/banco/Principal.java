package banco;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        ContaBancaria c1=new ContaBancaria("João",200,1500.00);
        c1.depositar(1000);
        c1.sacar(2000);
        c1.sacar(100);
        System.out.println(c1.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaBancaria c2=new ContaBancaria("",0,2900);
        c1.depositar(1);
        c1.sacar(1);
        c1.sacar(100);
        System.out.println(c2.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaBancaria c3=new ContaBancaria("Henrique",5000,0);
        c3.depositar(500);
        c3.sacar(3000);
        c3.sacar(1000);
        System.out.println(c3.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaPouPanca c4=new ContaPouPanca(0.3,"",200,100);
        c4.aplicarJuros();
        c4.depositar(100);
        c4.sacar(800);
        c4.sacar(100);
        System.out.println(c4.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaPouPanca c5=new ContaPouPanca(1.1,"Fabio",1000,3000);
        c5.aplicarJuros();
        c5.depositar(100);
        c5.sacar(800);
        c5.sacar(100);
        System.out.println(c5.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaPouPanca c6=new ContaPouPanca(2.9,"Maria",8000,8000);
        c6.aplicarJuros();
        c6.depositar(1000);
        c6.sacar(5000);
        c6.sacar(100000);
        System.out.println(c6.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaCorrente c7=new ContaCorrente(2000,"",1000,3);
        c7.depositar(1000);
        c7.sacar(2000);
        c7.sacar(5000);
        System.out.println(c7.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaCorrente c8=new ContaCorrente(500,"Carlos",500,5000);
        c8.depositar(500);
        c8.sacar(500);
        c8.sacar(1500);
        System.out.println(c8.toString());
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*//////////////////////////////////////////////////////////////////////////////////////*/");
        
        ContaCorrente c9=new ContaCorrente(100,"Carlos",8000,12);
        c9.depositar(2000);
        c9.sacar(2000);
        c9.sacar(11200);
        System.out.println(c9.toString());
       
    }
    
}
