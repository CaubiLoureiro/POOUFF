package tarefa05.questão04;

public class FuncionarioPorHora extends Funcionario{

    private double salarioPorHora;
    private double horasTrabalhadas;

    public FuncionarioPorHora(String primeiroNome, String ultimoNome, double salarioPorHora, double horasTrabalhadas) {
        super(primeiroNome, ultimoNome);
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double ganhos() {
        if ( getHorasTrabalhadas() <= 40 ) // nenhuma hora extra
            return getSalarioPorHora() * getHorasTrabalhadas();
        else
            return 40 * getSalarioPorHora() + ( getHorasTrabalhadas() - 40 ) * getSalarioPorHora() * 1.5;
    }
    @Override
    public String toString(){

        return String.format("%s\nSalario por hora: %.2f\nHoras trabalhadas: %.2f\n", super.toString(), getSalarioPorHora(), getHorasTrabalhadas());
    }
}
