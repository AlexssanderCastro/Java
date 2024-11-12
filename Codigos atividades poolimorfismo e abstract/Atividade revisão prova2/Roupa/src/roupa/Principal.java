package roupa;

/**
 *
 * @author Alexssander
 */
public class Principal {

    public static void main(String[] args) {
        FilialPatrocinioLojaFisica lf = new FilialPatrocinioLojaFisica();
        lf.setDescricao("calça");
        lf.setValor(50.0);
        lf.setGerente("João");
        lf.setEndereco("Rua A, 123");
        System.out.println(lf.toString());
        lf.emprestar();
        System.out.println(lf.toString());
        lf.devolver();
        System.out.println(lf.toString());

        System.out.println("/*////////////////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*////////////////////////////////////////////////////////////////////////////////////////////////*/");

        FilialPatosLojaVirtual lv = new FilialPatosLojaVirtual();
        lv.setDescricao("jaqueta");
        lv.setValor(100.0);
        lv.setUrl("https://lojavirtual.com");
        FilialPatosLojaVirtual.setNomeEntregador("Carlos");
        System.out.println(lv.toString());
        lv.emprestar();
        System.out.println(lv.toString());
        lv.devolver();
        System.out.println(lv.toString());

        System.out.println("/*////////////////////////////////////////////////////////////////////////////////////////////////*/");
        System.out.println("/*////////////////////////////////////////////////////////////////////////////////////////////////*/");
        
        FilialPatrocinioLojaFisica li = new FilialPatrocinioLojaFisica();
        li.setDescricao("sapato");
        li.setValor(0);
        li.setGerente("Maria");
        li.setEndereco("Rua B, 456");
        System.out.println(li.toString());
    }
    
}
