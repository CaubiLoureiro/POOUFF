package tarefa04.question06;

public class Ataques {
    private String nome;
    private String efeito;
    private int dano;

    public Ataques(String nome, String efeito, int dano){
        this.nome = nome;
        this.efeito = efeito;
        this.dano = dano;

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public String getNome() {
        return nome;
    }

    public String getEfeito() {
        return efeito;
    }

    public int getDano() {
        return dano;
    }
}
