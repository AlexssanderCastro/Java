package aulasobrescritatostring;

public class Principal {

    public static void main(String[] args) 
    {
        Animal lulu = new Animal("Luluzinho", "gato", false);
        lulu.fazerSom();
        
        Cachorro joaquim = new Cachorro ("Joaquim", "Lulu da pomerânia", true);
        joaquim.fazerSom();
        
        Animal theo = new Cachorro("Théo", "pincher", true);
        System.out.println(lulu.toString());
        
        
    }

}
    

