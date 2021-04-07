package tarefa05.questão02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> pegada = new ArrayList();


        pegada.add(new Bicicleta());
        pegada.add(new Carro("gasolina", 500, 100));
        pegada.add(new Construcao(5, true, 10, true));


        for(CarbonFootprint index : pegada){
            index.getCarbonFootprint();
        }


    }
}
