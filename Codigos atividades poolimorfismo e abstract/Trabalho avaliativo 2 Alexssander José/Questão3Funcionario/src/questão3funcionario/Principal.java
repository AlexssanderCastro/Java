package questão3funcionario;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
       Funcionario f1=new Funcionario();
       f1.setNome("Carlos Alberto");
       f1.setSalario(1500.00);
       f1.calcularBonus("janeiro");
       f1.calcularBonus("dezembro");
       System.out.println(f1.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Funcionario f2=new Funcionario();
       f2.setNome("Maria Nunes");
       f2.setSalario(1600.00);
       f2.calcularBonus("fevereiro");
       f2.calcularBonus("dezembro");
       System.out.println(f2.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Funcionario f3=new Funcionario();
       f3.setNome("Felipe Oliveira");
       f3.setSalario(1000.00);
       f3.calcularBonus("setembro");
       f3.calcularBonus("dezembro");
       System.out.println(f3.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Gerente g1=new Gerente();
       g1.setNome("Lais Rodrigues");
       g1.setSalario(3000);
       g1.setGratificacao(1100);
       g1.calcularBonus("dezembro");
       g1.calcularBonus("setembro");
       System.out.println(g1.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Gerente g2=new Gerente();
       g2.setNome("Antônio Fagundes");
       g2.setSalario(2000);
       g2.setGratificacao(900);
       g2.calcularBonus("dezembro");
       g2.calcularBonus("setembro");
       System.out.println(g2.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Gerente g3=new Gerente();
       g3.setNome("Mario Camarão");
       g3.setSalario(4000);
       g3.setGratificacao(100);
       g3.calcularBonus("dezembro");
       g3.calcularBonus("setembro");
       System.out.println(g3.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Programador p1=new Programador();
       p1.setNome("Laura Moura");
       p1.setSalario(2500);
       p1.setValorPontoFuncao(50);
       p1.calcularValorSoftware(100);
       p1.calcularBonus("setembro");
       p1.calcularBonus("janeiro");
       System.out.println(p1.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Programador p2=new Programador();
       p2.setNome("Thais Rocha");
       p2.setSalario(3500);
       p2.setValorPontoFuncao(20);
       p2.calcularValorSoftware(1000);
       p2.calcularBonus("janeiro");
       p2.calcularBonus("fevereiro");
       System.out.println(p2.toString());
       
       System.out.println("/*/////////////////////////////////////////////////////////////////////////////////*/");
       
       Programador p3=new Programador();
       p3.setNome("Tâmara");
       p3.setSalario(2750);
       p3.setValorPontoFuncao(5);
       p3.calcularValorSoftware(10000);
       p3.calcularBonus("janeiro");
       p3.calcularBonus("dezembro");
       System.out.println(p3.toString());
       
       
    }
    
}
