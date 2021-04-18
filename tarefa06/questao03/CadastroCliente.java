package tarefa06.questao03;

import java.util.ArrayList;

public class CadastroCliente {
    private int quantidadeCliente ;
    private ArrayList<Cliente> listaCliente;

    public CadastroCliente(){
        this.quantidadeCliente = 0;
        this.listaCliente = new ArrayList<>();
    }

    public void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException{
        boolean contido = false;
        for(Cliente index : listaCliente){
            if(cliente.getCpf().equals(index.getCpf())){
                contido = true;
            }
        }
        if(quantidadeCliente == 10){
            throw new RepositorioException();

        }else if(contido){
            throw new ClienteJaExistenteException();

        } else{
            listaCliente.add(cliente);
            this.quantidadeCliente = this.quantidadeCliente+1;
        }
    }

    public void busca(Cliente cliente) throws ClienteInexistenteException{
        boolean encontrado = false;
        for(Cliente index : listaCliente){
            if (cliente.getCpf().equals(index.getCpf())){
                encontrado = true;
            }
        }

        if(!encontrado){
            throw new ClienteInexistenteException();
        }else{
            System.out.println("Cliente está na lista.");
        }
    }







}
