package tarefa04.question05;

public class Pessoa {
    private String endereco;

    public Pessoa(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void printInfo(){
        System.out.printf("Endereço: %s\n", this.getEndereco());
    }
}
