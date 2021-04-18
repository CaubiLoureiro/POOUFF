package tarefa06.questao02;

public class ContaCorrente {
    private float limite;
    private  float saldo;
    private float valorLimite;


    public void sacar(float saque) throws IllegalArgumentException {


        if (saque > saldo){
            throw new IllegalArgumentException("Erro ao tentar sacar, voĉe não possui esse valor na conta");
        }
        else{
            this.saldo = this.saldo - saque;
        }
    }


    public void depositar(float deposito) throws IllegalArgumentException{
        if (deposito < 0){
            throw new IllegalArgumentException("Erro ao tentar depositar, você não pode depositar um valor negativo.");
        }else{
            this.saldo = this.saldo + deposito;
        }
    }


    public void setValorLimite(float valorLimite) throws IllegalArgumentException{
        if(valorLimite < 0){
            throw new IllegalArgumentException("Erro ao tentar setar, voĉe não pode setar valor negativo");
        }else{
            this.valorLimite = valorLimite;
        }
    }
}

