package aulaarraylista;
import java.util.ArrayList;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        //ArrayList classe pertencente no pacote util
        //Estrutura de dados no formato de lista
        ArrayList lista= new ArrayList();
        
        //Adicionando valores aleatórios na lista
        
        lista.add("Ian");
        lista.add("Lucas");
        lista.add("Pedro");
        lista.add("Paulo");
        
        lista.add(2.4);
        lista.add(100);
        lista.add(true);
        
        
        //Adicionando valor com indice 
        lista.add(5,"Ligia");
        
        //Iterando a lista
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        System.out.println("\n/*********************************************************************/");
        System.out.println("/*********************************************************************/\n");
        //mostrando o tamanho da lista
        System.out.println("/*********************************************************************/");
        System.out.println("A lista tem: "+lista.size()+" posições");
        System.out.println("/*********************************************************************/\n");
        
        //Mostrando e removendo um elemento da lista
        System.out.println("Elemento 3: "+ lista.get(3));
        System.out.println("/*********************************************************************/\n");
        System.out.println("Removendo");
        lista.remove(4);
        
        for(int i=0; i<lista.size(); i++){
            System.out.println(lista.get(i));
        }
        
        System.out.println("\n/*********************************************************************/");
        System.out.println("/*********************************************************************/\n");
        
        //testando se determinado valor está na lista
        String elemento="paulo";
        boolean teste =lista.contains(elemento);
        if(teste){
            System.out.println("Valor existente");
        }else{
            System.out.println("Valor não existente");
        }
        
        System.out.println("\n/*********************************************************************/");
        System.out.println("/*********************************************************************/\n");
        
        //Verificando o posicionamento de um valor na lista
        System.out.println("O valor Ligia está çocalizado no indice: "+lista.indexOf("Ligia"));
        
        
        
        
        
    }
    
}
