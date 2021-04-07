package tarefa05.questão04;

public class FuncionarioComissionado extends Funcionario{
    private double vendas;
    private double porcentagem;

    public FuncionarioComissionado(String primeiroNome, String ultimoNome, double vendas, double porcentagem) {
        super(primeiroNome, ultimoNome);
        this.vendas = vendas;
        this.porcentagem = porcentagem;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public String toString(){
        return String.format("%s\nVendas: %.2f\nPorcentagem: %.2f\n", super.toString(), getVendas(), getPorcentagem());
    }

    @Override
    public double ganhos() {
        return ((getPorcentagem() / 100) + 1) * getVendas();
    }
}
