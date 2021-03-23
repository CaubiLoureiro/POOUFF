package tarefa04.question05;

public class PessoaFisica extends Pessoa{
    private String nome;
    private String cpf;
    private String dataAniversario;

    public PessoaFisica(String nome, String cpf, String endereco, String dataAniversario){
        super(endereco);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setDataAniversario(dataAniversario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(String dataAniversario) {
        this.dataAniversario = dataAniversario;
    }
    @Override
    public void printInfo(){
        System.out.printf("Nome: %s\n", this.getNome());
        System.out.printf("CPF: %s\n", this.getCpf());
        super.printInfo();
        System.out.printf("Data de Aniversário: %s\n", this.getDataAniversario());
    }

}
