package questão3funcionario;

/**
 *
 * @author Alexssander
 */
public class Funcionario {
    
    private String nome;
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    void calcularBonus(String mesPagamento){
        if(mesPagamento.equals("dezembro")){
            System.out.println("Funcionário "+nome+". Salário para o mês "+mesPagamento+" : R$"+1.1*salario);
        }else{
            System.out.println("Funcionário "+nome+". Salário para o mês "+mesPagamento+" : R$"+salario);
        }
        
        
    }
    
    @Override
    public String toString() {
        return "Funcionario | nome: " + nome + ", salario: " + salario;
    }
    
}
