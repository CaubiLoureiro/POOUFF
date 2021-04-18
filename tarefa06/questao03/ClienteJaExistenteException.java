package tarefa06.questao03;

public class ClienteJaExistenteException extends Exception{

    public String toString(){
        return "Já existe esse cliente na lista.";
    }
}
