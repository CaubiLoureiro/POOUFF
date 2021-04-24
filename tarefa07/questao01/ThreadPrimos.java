package tarefa07.questao01;

import tarefa7.questao01.QuantidadeDePrimos;

public class ThreadPrimos implements Runnable{
    QuantidadeDePrimos objeto;
    private int pegaMetade;

    public ThreadPrimos(QuantidadeDePrimos objeto, int metade){
        this.objeto = objeto;
        this.pegaMetade = metade;
        new Thread(this).start();
    }



    @Override
    public void run() {
        if (pegaMetade == 1) {
            int metade = (objeto.getNumeroMax()/2) + 1;
            for(int i = metade; i<= objeto.getNumeroMax(); i++) {

                if(i!=1){// IF para no considerar o 1 como primo
                    if (i % 2 != 0 || i % 3 != 0 || i == 2 || i == 3) {// Se o resto da divisao por 2 e por 3 for diferente de 0 ento  primo, ou se for 2 e 3.
                        QuantidadeDePrimos.qtdPrimos++;
                    }
                }
            }
        } else {
            // Repete o mesmo processo do IF acima, porem para a outra metade do numero.
            int metade = objeto.getNumeroMax()/2;
            for(int i=0; i<=metade; i++){
                if(i!=1){
                    if (i % 2 != 0 || i % 3 != 0 || i == 2 || i == 3) {
                        QuantidadeDePrimos.qtdPrimos++;
                    }
                }

            }

        }


    }
}
