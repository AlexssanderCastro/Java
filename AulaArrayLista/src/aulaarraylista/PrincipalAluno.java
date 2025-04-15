package aulaarraylista;
import java.util.ArrayList;

/**
 *
 * @author Alexssander
 */

public class PrincipalAluno {
    
    public static void main(String args[]){
        
        Aluno ian= new Aluno();
        ian.setNome("Ian");
        ian.setSobrenome("Raicar");
        ian.setCurso("ADS");
        ian.setRA("03030303-1");
        ian.setAnoIngresso(2025);
        ian.setPrevisaoTermino(2028);
        
        Aluno alexssander= new Aluno();
        alexssander.setNome("Alexssander");
        alexssander.setSobrenome("José");
        alexssander.setCurso("ADS");
        alexssander.setRA("02020202-1");
        alexssander.setAnoIngresso(2023);
        alexssander.setPrevisaoTermino(2026);
        
        Aluno oliveira= new Aluno();
        oliveira.setNome("Oliveira");
        oliveira.setSobrenome("Castro");
        oliveira.setCurso("ADS");
        oliveira.setRA("01010101-1");
        oliveira.setAnoIngresso(2022);
        oliveira.setPrevisaoTermino(2025);
        
        ArrayList<Aluno> lista= new ArrayList();
        lista.add(ian);
        lista.add(alexssander);
        lista.add(oliveira);
        
        for(Aluno aux: lista){
            System.out.println("Nome e sobrenome: "+aux.getNome()+" "+aux.getSobrenome());
            System.out.println("Curso: "+aux.getCurso());
            System.out.println("RA: "+aux.getRA());
            System.out.println("");
        }
        
    }
    
    
    
}
