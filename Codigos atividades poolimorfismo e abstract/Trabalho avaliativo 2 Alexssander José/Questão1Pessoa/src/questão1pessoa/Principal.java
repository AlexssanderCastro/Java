package questão1pessoa;

/**
 *
 * @author alexs
 */
public class Principal {

    public static void main(String[] args) {
        Pessoa joao=new Pessoa();
        joao.setCódigo(1234);
        joao.setDataCadastro("01/01/2024");
        joao.setNome("Joao");
        System.out.println("Pessoa\nNome: "+joao.getNome()+"\nCodigo: "+joao.getCódigo()+"\nData de Cadastro: "+joao.getDataCadastro());
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        /*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        Pessoa maria=new Pessoa();
        maria.setCódigo(1231);
        maria.setDataCadastro("02/12/2023");
        maria.setNome("Maria");
        System.out.println("Pessoa\nNome: "+maria.getNome()+"\nCodigo: "+maria.getCódigo()+"\nData de Cadastro: "+maria.getDataCadastro());
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        /*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        Cliente abadia=new Cliente();
        abadia.setCódigo(1232);
        abadia.setDataCadastro("05/05/2010");
        abadia.setNome("Abadia");
        abadia.setEmail("abadia123@gmail.com");
        abadia.setEndereco("Bairro Centro Rua dos Bobos nº 321");
        abadia.setTelefone("3438323333");
        System.out.println("Cliente\nNome: "+abadia.getNome()+"\nCodigo: "+abadia.getCódigo()+"\nData de Cadastro: "+abadia.getDataCadastro()+"\nEmail: "+abadia.getEmail()+"\nEndereço: "+abadia.getEndereco()+"\nTelefone: "+abadia.getTelefone());
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        /*////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////*/
        Cliente antonio=new Cliente();
        antonio.setCódigo(4321);
        antonio.setDataCadastro("20/01/2020");
        antonio.setNome("Antonio");
        antonio.setEmail("antoniofoguetinho@gmail.com");
        antonio.setEndereco("Bairro Centro Rua dos Canarinhos nº 123");
        antonio.setTelefone("3438323132");
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        System.out.println("Cliente\nNome: "+antonio.getNome()+"\nCodigo: "+antonio.getCódigo()+"\nData de Cadastro: "+antonio.getDataCadastro()+"\nEmail: "+antonio.getEmail()+"\nEndereço: "+antonio.getEndereco()+"\nTelefone: "+antonio.getTelefone());
        /*/////////////////////////////////////////////////////////////////////////////////*/
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        Usuario pedro=new Usuario();
        pedro.setCódigo(4323);
        pedro.setDataCadastro("28/01/2013");
        pedro.setNome("Pedro");
        pedro.setLogin("pedro123");
        pedro.setSenha("pedro121212");
        System.out.println("Usuario:\n");
        System.out.println("Nome: "+pedro.getNome()+"\nCodigo: "+pedro.getCódigo()+"\nData de Cadastro: "+pedro.getDataCadastro()+"\nLogin: "+pedro.getLogin()+"\nSenha: "+pedro.getSenha());
        
        System.out.println("*////////////////////////////////////////////////////////////////////////////////////////////////////////////*");
        Usuario carlos=new Usuario();
        carlos.setCódigo(1111);
        carlos.setDataCadastro("21/01/2000");
        carlos.setNome("Carlos");
        carlos.setLogin("carlos123");
        carlos.setSenha("carlos1212");
        System.out.println("Usuario:\n");
        System.out.println("Nome: "+carlos.getNome()+"\nCodigo: "+carlos.getCódigo()+"\nData de Cadastro: "+carlos.getDataCadastro()+"\nLogin: "+carlos.getLogin()+"\nSenha: "+carlos.getSenha());
        
    }
    
}
