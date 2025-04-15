package roupa;

/**
 *
 * @author Alexssander
 */
public abstract class ItemRoupa {
    
    private String descricao;
    private double valor;
    private static boolean disponivel = true;
    
    public abstract void emprestar();
    public abstract void devolver();

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao.equals("calça") || descricao.equals("jaqueta") || descricao.equals("T-Shirt") || descricao.equals("shorts") || descricao.equals("vestido") || descricao.equals("blusa")) {
            this.descricao = descricao;
        } else {
            System.out.println("Item sem cadastro no sistema.");
            this.descricao = "sem cadastro";
        }
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor == 0) {
            this.valor = 10.00;
        } else {
            this.valor = valor;
        }
    }

    public static boolean isDisponivel() {
        return disponivel;
    }

    public static void setDisponivel(boolean disponivel) {
        ItemRoupa.disponivel = disponivel;
    }
        
    @Override
    public String toString() {
        return "ItemRoupa | [descricao : " + descricao + ", valor : R$" + valor + ", disponivel : " + disponivel;
    }
    
}
