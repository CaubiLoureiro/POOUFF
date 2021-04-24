package tarefa7.questao01;

import tarefa07.questao01.ThreadPrimos;

public class Main {
    public static void main(String[] args) {
        QuantidadeDePrimos objeto = new QuantidadeDePrimos(10);
        ThreadPrimos thread1 = new ThreadPrimos(objeto, 0);
        ThreadPrimos thread2 = new ThreadPrimos(objeto, 1);

        System.out.println(QuantidadeDePrimos.qtdPrimos);
    }
}
