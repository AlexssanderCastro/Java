package aulasobrescritatostring;

/**
 *
 * @author Ligia
 */
public class Animal 
{
    private String nome;
    private String raca;
    private boolean pedigree;

    public Animal(String nome, String raca, boolean pedigree) {
        this.nome = nome;
        this.raca = raca;
        this.pedigree = pedigree;
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public boolean isPedigree() {
        return pedigree;
    }
    
    public void fazerSom()
    {
        System.out.println("Som de um animal genérico");
    }
    
    @Override
    public String toString()
    {
        return "Animal [nome: "+nome+", raça: "+raca+", pedigree: "+pedigree+"]";
    }
    
}
