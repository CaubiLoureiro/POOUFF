package tarefa06.questao03;

public class DadoInvalidoException extends Exception{

    @Override
    public String toString(){
        return "Os dados de entrada são inválidos.";
    }
}
