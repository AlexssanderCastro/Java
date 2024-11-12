package roupa;

/**
 *
 * @author Alexssander
 */
public class FilialPatosLojaVirtual extends ItemRoupa{
    
    private String url;
    private static String nomeEntregador;
    private static boolean statusEntregador = true;

    public static String getNomeEntregador() {
        return nomeEntregador;
    }

    public static void setNomeEntregador(String aNomeEntregador) {
        nomeEntregador = aNomeEntregador;
    }

    public static boolean isStatusEntregador() {
        return statusEntregador;
    }

    public static void setStatusEntregador(boolean aStatusEntregador) {
        statusEntregador = aStatusEntregador;
    }
    
    

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    @Override
    public void emprestar() {
        if (ItemRoupa.isDisponivel() && statusEntregador) {
            System.out.println("O item está disponível para empréstimo e será entregue por " + nomeEntregador);
            ItemRoupa.setDisponivel(false);
            setStatusEntregador(false);
        } else {
            System.out.println("O item ou entregador não estão disponíveis.");
        }
    }
    
    @Override
    public void devolver() {
        if (statusEntregador==false) {
            System.out.println("O entregador " + nomeEntregador + " está a caminho para retirar o item.");
            ItemRoupa.setDisponivel(true);
            setStatusEntregador(true);
            System.out.println("Devolução feita com sucesso na loja virtual.");
        } else {
            System.out.println("O entregador não está disponível para retirada.");
        }
    }
    
     @Override
    public String toString() {
        return "FilialPatosLojaVirtual | " + super.toString() + ", URL : " + url + ", nomeEntregador : " + nomeEntregador + "]";
    }
    
    
    
    
    
    
    
}
