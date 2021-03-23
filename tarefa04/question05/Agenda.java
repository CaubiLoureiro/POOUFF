package tarefa04.question05;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<PessoaFisica> pessoaFisica;
    private ArrayList<PessoaJuridica> pessoaJuridica;


    public Agenda(){
        pessoaFisica = new ArrayList<PessoaFisica>();
        pessoaJuridica = new ArrayList<PessoaJuridica>();
    }

    public void addContato(String nome, String cpf, String endereco, String dataAniversario) {
        boolean existe = false;
        for (PessoaFisica index : pessoaFisica) {
            if (index.getCpf().equals(cpf)){
                existe = true;
            }
        }
        if (existe){
            System.out.println("Contato já existente na agenda.");
        }else{
            pessoaFisica.add(new PessoaFisica(nome, cpf, endereco, dataAniversario));
        }
    }

    public void addContato(String razaoSocial, String cnpj, String endereco, double faturamento){
        boolean existe = false;
        for (PessoaJuridica index : pessoaJuridica) {
            if (index.getCnpj().equals(cnpj)){
                existe = true;
            }
        }
        if (existe){
            System.out.println("Contato já existente na agenda.");
        }else{
            pessoaJuridica.add(new PessoaJuridica(razaoSocial, cnpj, endereco, faturamento));
        }
    }

    public void removerContato(String nome, String cpf, String endereco, String dataAniversario){
        pessoaFisica.removeIf(index -> index.getCpf().equals(cpf));
    }

    public void removerContato(String razaoSocial, String cnpj, String endereco, double faturamento){
        pessoaJuridica.removeIf(index -> index.getCnpj().equals(cnpj));
    }

    public void printContatos(){
        System.out.println("Pessoas Fisícas cadastradas:");
        for(PessoaFisica index : pessoaFisica){
            System.out.printf("Nome: %s, CPF: %s, Endereço: %s, Data de Aniversário: %s", index.getNome(),
                    index.getCpf(), index.getEndereco(), index.getDataAniversario());
        }
        System.out.println("\n\nPessoas Juridicas cadastradas");
        for(PessoaJuridica index : pessoaJuridica){
            System.out.printf("Razão Social: %s, CNPJ: %s, Endereço: %s, Faturamento: %f", index.getRazaoSocial(),
                    index.getCnpj(), index.getEndereco(), index.getFaturamento());
        }
        System.out.println();
    }

    public void printContato(String nome, String cpf, String endereco, String dataAniversario){
        boolean existe = false;
        System.out.println();
        for(PessoaFisica index : pessoaFisica){
            if (index.getCpf().equals(cpf)){
                index.printInfo();
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Contato não encontrado na agenda.");
        }
        System.out.println();
    }

    public void printContato(String razaoSocial, String cnpj, String endereco, double faturamento){
        boolean existe = false;
        System.out.println(" ");
        for(PessoaJuridica index : pessoaJuridica){
            if (index.getCnpj().equals(cnpj)){
                index.printInfo();
                existe = true;
            }
        }
        if(!existe){
            System.out.println("Contato não encontrado na agenda.");
        }
        System.out.println();
    }

}
