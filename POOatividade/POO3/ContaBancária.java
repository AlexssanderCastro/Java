package exercicioContaBancaria;

import java.util.Scanner;

/**
 *
 * @author IFTM
 */
public class ContaBancária {
    public double saldo=0;
    public String titular;
    Scanner sc = new Scanner(System.in);
    public void depositar(){
        System.out.println("Valor depositado:");
        double valor= sc.nextDouble();
        saldo=saldo+valor;
          
    }
    public void sacar(){
        System.out.println("Valor sacado:");
        double valor= sc.nextDouble();
        saldo=saldo-valor;
        
    }
    public void exibirSaldo(){
        
        System.out.println("Seu saldo é: R$ "+String.format("%.2f",saldo));
        
    }
    
}


