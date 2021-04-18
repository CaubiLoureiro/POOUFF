package tarefa06.questao05;

import java.util.*;

public class Converte {



    public static <T> Set<T> arrayListEmHashSet(ArrayList<T> list){
        Set<T> nova = new HashSet<>(list);
        return nova;
    }

    public static <T> Queue<T> hasSetEmPriorityQueue(Set<T> list){
        Queue<T> nova = new PriorityQueue<>(list);
        return nova;
    }




    public static <T> Deque<T> PriorityQueueEmArrayDeque(Queue<T> list) {

        Deque<T> nova = new ArrayDeque<>(list);
        return nova;
    }

    public static <T> Set<T> arrayDequeEmTreeSet(Deque<T> list) {
        Set<T> nova = new TreeSet<>(list);
        return nova;
    }
}
