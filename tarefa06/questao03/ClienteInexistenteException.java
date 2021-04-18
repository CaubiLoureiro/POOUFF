package tarefa06.questao03;

public class ClienteInexistenteException extends Exception{

    public String toString(){
        return "Cliente não encontrado na lista";
    }
}
