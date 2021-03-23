package tarefa04.question05;

public class PessoaJuridica extends Pessoa {

    private String razaoSocial;
    private String cnpj;
    private double faturamento;

    public PessoaJuridica(String razaoSocial, String cnpj, String endereco, double faturamento) {
        super(endereco);
        this.setCnpj(cnpj);
        this.setFaturamento(faturamento);
        this.setRazaoSocial(razaoSocial);
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public double getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(double faturamento) {
        this.faturamento = faturamento;
    }

    @Override
    public void printInfo() {
        System.out.printf("Razão Social: %s\n", this.getRazaoSocial());
        System.out.printf("CNPJ: %s\n", this.getCnpj());
        super.printInfo();
        System.out.printf("Faturamento: %f\n", this.getFaturamento());
    }
}