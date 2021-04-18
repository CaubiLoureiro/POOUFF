package tarefa06.questao01;

public class Main {
    public static void main(String[] args) {

        try{
            Excecao.IllegalArgumentException();
            Excecao.NumberFormatException();

        } catch (NumberFormatException numberFormatException){
            System.out.println("Lançado para indicar que o aplicativo tentou converter uma string em um dos tipos numéricos, mas que a string não tem o formato apropriado.");

        } catch (IllegalArgumentException illegalArgumentException){
            System.out.println("Lançado para indicar que um método recebeu um argumento ilegal ou impróprio");

        }
    }
}
