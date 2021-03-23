package tarefa04.question03;

public class Pessoa {
    private String nome;
    private int idade;
    Pessoa mae;
    Pessoa pai;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    public void addMae(String nome, int idade){
        mae = new Pessoa(nome, idade);
    }
    public void addPai(String nome, int idade){
        this.pai = new Pessoa(nome, idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
