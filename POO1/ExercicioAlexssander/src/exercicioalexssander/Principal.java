package exercicioalexssander;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        Smartphone celular1= new Smartphone();
        
        celular1.setMarca("Apple");
        celular1.setModelo("Iphone 20");
        celular1.setMemoriaRAM(16);
        celular1.setHd(128);
        System.out.println("O celular "+celular1.getModelo()+ " da marca "+celular1.getMarca()+" tem "+celular1.getMemoriaRAM()+"GB de memoria RAM e "+celular1.getHd()+"GB de memoria no HD");
        
        Smartphone celular2=new Smartphone(32,256);
        celular2.setModelo("Galaxy S24");
        celular2.setMarca("Samsung");
        
         System.out.println("O celular "+celular2.getModelo()+ " da marca "+celular2.getMarca()+" tem "+celular2.getMemoriaRAM()+"GB de memoria RAM e "+celular2.getHd()+"GB de memoria no HD");
         
         Smartphone celular3=new Smartphone("Redmi note 14 Pro","Xiao",20,-1);
         
         System.out.println("O celular "+celular3.getModelo()+ " da marca "+celular3.getMarca()+" tem "+celular3.getMemoriaRAM()+"GB de memoria RAM e "+celular3.getHd()+"GB de memoria no HD");
         
        
    }
    
}
