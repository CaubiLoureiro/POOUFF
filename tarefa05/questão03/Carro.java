package tarefa05.questão03;

public class Carro implements CarbonFootprint{
    private String combustivel;
    private float cilindrada;
    private float km;


    public Carro(String combustivel, float cilindrada, float km){
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
        this.km = km;
    }

    @Override
    public void getCarbonFootprint() {
        System.out.println(km * 0.82 * 0.75 * 3.7  + "kg de CO2");
    }
}
