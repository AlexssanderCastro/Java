package zoologico;

/**
 *
 * @author Alexssander
 */
public class Mamifero extends Animal{
    
    private double peso;
    private String tipoDePelo;

    public void setPeso(double peso) {
        if (peso <= 0) {
            System.out.println("Peso inválido. Definido como 1.0 kg.");
            this.peso = 1.0;
        } else {
            this.peso = peso;
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setTipoDePelo(String tipoDePelo) {
        if (tipoDePelo == null || tipoDePelo.equals("")) {
            System.out.println("Tipo de pelo inválido. Definido como 'Curto'.");
            this.tipoDePelo = "Curto";
        } else {
            this.tipoDePelo = tipoDePelo;
        }
    }

    public String getTipoDePelo() {
        return tipoDePelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("O mamífero " + getNome() + " está emitindo som.");
    }

    @Override
    public void mover() {
        System.out.println("O mamífero " + getNome() + " está se movendo.");
    }

    @Override
    public String toString() {
        return "Mamifero | " + super.toString() + ", peso : " + peso + " kg, tipo de pelo : " + tipoDePelo + "]";
    }
}
