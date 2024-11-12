package questão3funcionario;

/**
 *
 * @author Alexssander
 */
public class Programador extends Funcionario{
    
    private double valorPontoFuncao;

    public double getValorPontoFuncao() {
        return valorPontoFuncao;
    }

    public void setValorPontoFuncao(double valorPontoFuncao) {
        this.valorPontoFuncao = valorPontoFuncao;
    }
    
    void calcularValorSoftware(int linhasCodigo){
        
        System.out.println("Orçamento estimado: R$"+linhasCodigo*valorPontoFuncao);
    }
    
    void calcularBonus(String mesPagamento){
         if(mesPagamento.equals("dezembro") || mesPagamento.equals("janeiro") || mesPagamento.equals("julho")){
             System.out.println("Funcionário/Programador "+getNome()+". Salário para o mês "+mesPagamento+" : R$"+getSalario());
         }else{
             System.out.println("Funcionário/Programador "+getNome()+". Salário para o mês "+mesPagamento+" : R$"+getSalario()*1.05 );
         }
    }
    @Override
    public String toString() {
        return "Programador | nome: " + getNome() + ", salario: " + getSalario() + ", valorPontoFuncao: " + valorPontoFuncao;
    }
}
