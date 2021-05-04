package tarefa07.questao01;

import tarefa07.questao01.ThreadPrimos;

public class Main {
    public static void main(String[] args) {
        QuantidadeDePrimos objeto = new QuantidadeDePrimos(10);
        ThreadPrimos thread1 = new ThreadPrimos(objeto, 0);
        ThreadPrimos thread2 = new ThreadPrimos(objeto, 1);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.start();
        t2.start();

        while(t1.isAlive() || t2.isAlive()){
            continue;
        }

        System.out.println(QuantidadeDePrimos.getQtdPrimos());

    }
}
