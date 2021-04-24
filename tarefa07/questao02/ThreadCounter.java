package tarefa07.questao02;

import java.util.Random;

public class ThreadCounter implements Runnable{

    private Counter object;
    private int incrementOrDecrement;
    private Random random = new Random();

    public ThreadCounter(Counter object, int incrementOrDecrement){
        this.object = object;
        this.incrementOrDecrement = incrementOrDecrement;
        new Thread(this).start();
    }


    @Override
    public void run() {

        if (this.incrementOrDecrement == 1){
            int suspens = random.nextInt(500);
            for(int i = 0; i<20; i++){
                object.increment();
                try {
                    Thread.sleep(suspens);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }else{
            int suspens = random.nextInt(500);
            for(int i = 0; i<20; i++) {
                object.decrement();
                try {
                    Thread.sleep(suspens);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }

    }
}
