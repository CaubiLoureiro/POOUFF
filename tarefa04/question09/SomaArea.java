package tarefa04.question09;

import tarefa04.question04.Formas;

import java.util.List;

public class SomaArea {


    public static <T extends Formas> void somaAreas (List<T> vetor){
        double somaDaArea = 0;

        for(T index : vetor){
            somaDaArea += index.getArea();
        }

        System.out.println("A soma da área das fomas no vetor é: " + somaDaArea);
    }
}
