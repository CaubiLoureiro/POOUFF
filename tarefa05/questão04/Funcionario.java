package tarefa05.questão04;

public abstract class Funcionario {
    private String primeiroNome;
    private String ultimoNome;


    public Funcionario(String primeiroNome, String ultimoNome){
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String toString(){

        return String.format( "%s %s", getPrimeiroNome(), getUltimoNome());
    }

    public abstract double ganhos();
}
