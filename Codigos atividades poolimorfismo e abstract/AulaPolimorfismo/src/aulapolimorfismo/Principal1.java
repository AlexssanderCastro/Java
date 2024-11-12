package aulapolimorfismo;

/**
 *
 * @author Ligia
 */
public class Principal1 {

    public static void main(String[] args) 
    {
        Personalidade personalidade = new Personalidade();
        Extrovertido extrovertido = new Extrovertido();
        Introvertido introvertido = new Introvertido();
        Otimista otimista = new Otimista();
        Pessimista pessimista = new Pessimista();
        ProAtivo proativo = new ProAtivo();
        
        Personalidade [] variasPersonalidades = new Personalidade[6];
        variasPersonalidades[0] = personalidade;
        variasPersonalidades[1] = extrovertido;
        variasPersonalidades[2] = introvertido;
        variasPersonalidades[3] = otimista;
        variasPersonalidades[4] = pessimista;
        variasPersonalidades[5] = proativo;
        
//        System.out.println("Introvertido: " + variasPersonalidades[2].falar());
//        System.out.println("Pessimista: " + variasPersonalidades[4].falar());
//        System.out.println("Pro ativo: " + variasPersonalidades[5].falar());
        
        personalidade.acionarFalar(variasPersonalidades[5]);
        
    }
    
}
