package aulasobrescritatostring;

/**
 *
 * @author Ligia
 */
public class Cachorro extends Animal
{

    public Cachorro(String nome, String raca, boolean pedigree) 
    {
        super(nome, raca, pedigree);
    }
    
    @Override
    public void fazerSom()
    {
        System.out.println("Latindo, auau...");
    }
    
}
