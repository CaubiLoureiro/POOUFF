package tarefa05.questão04;

public class FuncionarioComissionadoAssalariado extends FuncionarioComissionado{
    private double salarioBase;

    public FuncionarioComissionadoAssalariado(String primeiroNome, String ultimoNome, double vendas, double porcentagem, double salarioBase) {
        super(primeiroNome, ultimoNome, vendas, porcentagem);
        this.salarioBase = salarioBase;

    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ganhos(){
        return salarioBase + super.ganhos();
    }

    @Override
    public String toString(){
        return String.format("%sSalario base: %.2f\n", super.toString(), getSalarioBase());
    }
}
