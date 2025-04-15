package aulainterface2;

import java.util.ArrayList;

/**
 *
 * @author Alexssander
 */
public interface DAO {
    
    public void salvar(ArrayList dados);
    public ArrayList selecionar(ArrayList dados);
    public void deletar(int ChavePrimaria, String nome);
    public void alterar(String dados);
    
}
