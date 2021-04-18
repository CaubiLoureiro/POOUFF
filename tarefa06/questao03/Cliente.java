package tarefa06.questao03;

public class Cliente {

    private String nome;
    private String cpf;


    public Cliente(String nome, String cpf) throws DadoInvalidoException {
        setNome(nome);
        setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if (nome.length() < 3){
            throw new DadoInvalidoException();
        }
        else{
            this.nome = nome;
        }
    }



    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException{
        if(cpf.length() != 11){
            throw new DadoInvalidoException();

        } else{
            this.cpf = cpf;
        }
    }
}
