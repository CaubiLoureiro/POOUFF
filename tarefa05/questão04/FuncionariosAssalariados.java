package tarefa05.questão04;

public class FuncionariosAssalariados extends Funcionario{
    private double salarioSemanal;

    public FuncionariosAssalariados(String primeiroNome, String ultimoNome, double salarioSemanal){
        super(primeiroNome, ultimoNome);
        this.salarioSemanal = salarioSemanal;
    }


    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ganhos(){
        return getSalarioSemanal();
    }
    @Override
    public String toString(){

        return String.format("%s\n%.2f", super.toString(), getSalarioSemanal());
    }


}
