package carro;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        Carro c=new Carro("Ford","Fiesta",2000);
        Carro b=new Carro("Fiat","Toro",2016);
        Carro a=new Carro("Lamborguine","Urus",2020);
        
        
        System.out.println("Marca: "+c.getMarca()+" Modelo: "+c.getModelo()+" Ano: "+c.getAno());
        System.out.println("Valor Fip atualizado: R$"+c.verificarTabelaFipe(26000));
        
        
        System.out.println("Marca: "+b.getMarca()+" Modelo: "+b.getModelo()+" Ano: "+b.getAno());
        System.out.println("Valor Fip atualizado: R$"+b.verificarTabelaFipe(86000));
        
  
        System.out.println("Marca: "+a.getMarca()+" Modelo: "+a.getModelo()+" Ano: "+a.getAno());
        System.out.println("Valor Fip atualizado: R$"+a.verificarTabelaFipe(500000));
    }
    
}
