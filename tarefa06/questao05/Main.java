package tarefa06.questao05;

import java.util.*;

public class Main {
    /* A diferença na hora de mostrar os dados acontece pois cada coleção organiza os dados de maneiras direrentes, uma mostram na ordem de entrada
    * outras colocam em uma ordem definida pelo programador.*/

    public static void main(String[] args) {
        ArrayList<String> caracter = new ArrayList<>();
        caracter.add("A");
        caracter.add("C");
        caracter.add("D");
        caracter.add("B");
        caracter.add("E");

        for(String index : caracter){
            System.out.print(index.toString()+" ");
        }
        System.out.println();

        Set<String> list1 = Converte.arrayListEmHashSet(caracter);
        for(String index : list1){
            System.out.print(index.toString()+" ");

        }
        System.out.println();

        Queue<String> list2 = Converte.hasSetEmPriorityQueue(list1);

        System.out.println(list2);

        Deque<String> list3 = Converte.PriorityQueueEmArrayDeque(list2);
        System.out.println(list3);

        Set<String> list4 = Converte.arrayDequeEmTreeSet(list3);
        System.out.println(list4);
        

    }
}
