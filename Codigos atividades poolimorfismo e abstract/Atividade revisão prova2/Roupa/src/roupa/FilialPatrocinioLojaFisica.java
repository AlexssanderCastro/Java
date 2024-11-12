package roupa;

/**
 *
 * @author Alexssander
 */
public class FilialPatrocinioLojaFisica extends ItemRoupa{
    
    private String gerente; 
    private String endereco;

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    @Override
    public void emprestar(){
        if(isDisponivel()==true){
            
            System.out.println("O item está disponivel para empréstimo retire ele no endereço "+endereco);
            setDisponivel(false);
            
        }else{
            System.out.println("O item não está disponível");
        }
    }
    
    @Override
    public void devolver() {
        setDisponivel(true);
        System.out.println("Devolução feita com sucesso na loja física.");
    }
    
    @Override
    public String toString() {
        return "FilialPatrocinioLojaFisica | "+super.toString() + ", Gerente: " + gerente + ", Endereço: " + endereco+"]";
    }
    
}
