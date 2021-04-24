package tarefa07.questao02;

public class CounterUser {
    public static void main(String[] args) {

        Counter counter = new Counter();

        ThreadCounter thread1 = new ThreadCounter(counter, 0);
        ThreadCounter thread2 = new ThreadCounter(counter, 1);






    }
}

