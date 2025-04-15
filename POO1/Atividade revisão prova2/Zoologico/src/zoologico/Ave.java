package zoologico;

/**
 *
 * @author Alexssander
 */
public class Ave extends Animal{
    
    private double envergaduraDasAsas;
    private String corDaPena;

    public void setEnvergaduraDasAsas(double envergaduraDasAsas) {
        if (envergaduraDasAsas <= 0) {
            System.out.println("Envergadura das asas inválida. Definida como 0.5 m.");
            this.envergaduraDasAsas = 0.5;
        } else {
            this.envergaduraDasAsas = envergaduraDasAsas;
        }
    }

    public double getEnvergaduraDasAsas() {
        return envergaduraDasAsas;
    }

    public void setCorDaPena(String corDaPena) {
        if (corDaPena == null || corDaPena.equals("")) {
            System.out.println("Cor da pena inválida. Definida como 'Verde'.");
            this.corDaPena = "Verde";
        } else {
            this.corDaPena = corDaPena;
        }
    }

    public String getCorDaPena() {
        return corDaPena;
    }

    @Override
    public void emitirSom() {
        System.out.println("A ave " + getNome() + " está cantando.");
    }

    @Override
    public void mover() {
        System.out.println("A ave " + getNome() + " está voando.");
    }

    @Override
    public String toString() {
        return "Ave | " + super.toString() + ", envergaduraDasAsas : " + envergaduraDasAsas + " m, cor da pena : " + corDaPena + "]";
    }
    
}
