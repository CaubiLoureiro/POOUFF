package tarefa06.questao03;

public class Main {

    public static void main(String[] args) {


        try {
            CadastroCliente lista = new CadastroCliente();

            Cliente cliente = new Cliente("Jubileu", "12345678954");

            lista.inserir(cliente);
            lista.busca(cliente);


        } catch (RepositorioException e) {
            e.printStackTrace();
        } catch (ClienteJaExistenteException e) {
            e.printStackTrace();
        } catch (DadoInvalidoException e) {
            e.printStackTrace();
        } catch (ClienteInexistenteException e) {
            e.printStackTrace();
        }


    }
}
