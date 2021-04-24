package tarefa07.questao02;

import java.util.Random;

public class Counter {
    private int count;
    private Random gerador = new Random();


    public synchronized void increment(){
        if (count < 3){
            this.count ++;
            System.out.println("Ocorreu um increment o novo valor eh "+this.count);
        }else{
            try {
                System.out.println("Thread esperando contador ficar abaixo de 3 para incrementar");
                Thread.sleep(gerador.nextInt(200));

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }





    public synchronized void decrement(){
        if (count > 0){
            this.count--;
            System.out.println("Ocorreu um decrement o novo valor eh "+this.count);
        }
        else{
            try {
                System.out.println("Thread esperando contador ficar acima de 0 para decrementar");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
