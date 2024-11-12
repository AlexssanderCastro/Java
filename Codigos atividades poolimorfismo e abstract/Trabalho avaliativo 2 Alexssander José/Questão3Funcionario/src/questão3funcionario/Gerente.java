package questão3funcionario;

/**
 *
 * @author Alxssander
 */
public class Gerente extends Funcionario{
    
    private double gratificacao;

    public double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(double gratificacao) {
        this.gratificacao = gratificacao;
    }
    
    @Override
    void calcularBonus(String mesPagamento){    
        
        if(mesPagamento.equals("dezembro") || mesPagamento.equals("janeiro") || mesPagamento.equals("julho") || gratificacao>1000){
                double result=(getSalario()*1.2)+gratificacao;
                System.out.println("Funcionário/Gerente "+getNome()+". Salário para o mês "+mesPagamento+" : R$"+result);
            
            
        }else{
            System.out.println("Funcionário/Gerente "+getNome()+". Salário para o mês "+mesPagamento+" : R$"+getSalario());
        }
        
    }
    
    @Override
    public String toString() {
        return "Gerente | nome: " + getNome() + ", salario: " + getSalario() + ", gratificacao: " + gratificacao;
    }
    
}
