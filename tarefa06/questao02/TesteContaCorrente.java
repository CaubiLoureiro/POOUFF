package tarefa06.questao02;

public class TesteContaCorrente {
    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        try{
            conta.depositar(10);
            conta.sacar(50);
            conta.setValorLimite(500);

        }catch (IllegalArgumentException illegalArgumentException) {
            System.out.println(illegalArgumentException.getMessage());
        }
    }
}
