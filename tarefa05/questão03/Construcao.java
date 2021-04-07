package tarefa05.questão03;

import tarefa05.questão03.CarbonFootprint;

public abstract class Construcao implements CarbonFootprint {
    private int numeroPessoas;
    private boolean energiaRenovavel;
    private int numeroLampadas;
    private boolean arCondicionado;


    public Construcao(int numeroPessoas, boolean energiaRenovavel, int numeroLampadas, boolean arCondicionado){
        this.numeroPessoas = numeroPessoas;
        this.numeroLampadas = numeroLampadas;
        this.energiaRenovavel = energiaRenovavel;
        this.arCondicionado = arCondicionado;
    }


    @Override
    public void getCarbonFootprint() {
        if (energiaRenovavel){
            System.out.println("Parabéns a emissão de CO2 é bem baixa !!!!");
        }else if(arCondicionado){
            System.out.println("Levando em conta que o consumo médio de energia de uma pessoa nessa construção é de 200 KWh/mês, o consumo dessa construção é: "+ this.numeroPessoas*0.64+" toneladas de CO2 por mês.");
        }else{
            System.out.println("Levando em conta que o consumo médio de energia de uma pessoa nessa construção é de 100 KWh/mês o consumo dessa construção é: "+ this.numeroPessoas*0.32+" toneladas de CO2 por mês.");
        }

    }
}
