package zoologico;

/**
 *
 * @author Alexssander
 */

public abstract class Animal {
    
    private String nome;
    private int idade;
    private boolean exibindo;

    public void setNome(String nome) {
        if (nome == null || nome.equals("")) {
            System.out.println("Nome inválido. Definido como 'Sem Nome'.");
            this.nome = "Sem Nome";
        } else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida. Definida como 0.");
            this.idade = 0;
        } else {
            this.idade = idade;
        }
    }

    public int getIdade() {
        return idade;
    }

    public boolean isExibindo() {
        return exibindo;
    }

    public void setExibindo(boolean exibindo) {
        this.exibindo = exibindo;
    }

    public abstract void emitirSom();
    public abstract void mover();

    @Override
    public String toString() {
        return "Animal | [nome : " + nome + ", idade : " + idade + ", exibindo : " + exibindo;
    }
    
}
