package zoologico;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        //testando verificacoes da classe Mamifero
        Mamifero m = new Mamifero();
        m.setNome("");  
        System.out.println(m.getNome());
        m.setNome(null);  
        System.out.println(m.getNome());
        m.setIdade(-1);  
        System.out.println(m.getIdade());
        m.setPeso(0);  
        System.out.println(m.getPeso());
        m.setTipoDePelo("");  
        System.out.println(m.getTipoDePelo());
        System.out.println(m.toString());
        
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        
        // testando as verificaçoes da classe Ave
        Ave a = new Ave();
        a.setNome("");  
        System.out.println(a.getNome());
        a.setNome(null);  
        System.out.println(a.getNome());
        a.setIdade(-5);  
        System.out.println(a.getIdade());
        a.setEnvergaduraDasAsas(0);  
        System.out.println(a.getEnvergaduraDasAsas());
        a.setCorDaPena("");  
        System.out.println(a.getCorDaPena());
        System.out.println(a.toString());
        
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        
        Mamifero m1 = new Mamifero();
        // objetos sem verificaçoes
        m1.setNome("Leão");
        m1.setIdade(5);
        m1.setPeso(190.5);
        m1.setTipoDePelo("Longo");
        m1.setExibindo(true);
        System.out.println(m1.toString());
        m1.emitirSom();
        m1.mover();

        
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        System.out.println("/*///////////////////////////////////////////////////////////////////*/");
        
        Ave a1 = new Ave();
        a1.setNome("Papagaio");
        a1.setIdade(3);
        a1.setEnvergaduraDasAsas(2.0);
        a1.setCorDaPena("Verde");
        a1.setExibindo(false);
        System.out.println(a1.toString());
        a1.emitirSom();
        a1.mover();
        
    }
    
}
