package tarefa05.questão03;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> pegada = new ArrayList();


        pegada.add(new Bicicleta());
        pegada.add(new Carro("gasolina", 500, 100));


        /* Nesse caso o programa não vai mais funcionar, pois eu estou instanciando uma classe abstrata e classes abstratas não podem gerar objetos,
        * ou seja, n podem ser instanciadas */
        //pegada.add(new Construcao(5, true, 10, true));


        /* Instanciando as heranças da classe construção */
        pegada.add(new Casa(5, true, 10, true));
        pegada.add(new Escola(3, true, 8, false));
        /* Nesse caso o programa roda pois eu estou instanciado apenas as filhas da classe construção, essas filhas são todas classes concretas.*/


        for(CarbonFootprint index : pegada){
            index.getCarbonFootprint();
        }


    }
}
