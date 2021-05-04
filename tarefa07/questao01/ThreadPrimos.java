package tarefa07.questao01;

import tarefa07.questao01.QuantidadeDePrimos;

public class ThreadPrimos implements Runnable{
    QuantidadeDePrimos objeto;
    private int pegaMetade;


    public ThreadPrimos(QuantidadeDePrimos objeto, int metade){
        this.objeto = objeto;
        this.pegaMetade = metade;

    }



    @Override
    public void run() {
        if (pegaMetade == 1) {

            int metade = (objeto.getNumeroMax()/2) + 1;
            for(int i = metade; i<= objeto.getNumeroMax(); i++) {
                int divisores = 0;
                for(int j=1; j<=i; j++){

                    if (i%j == 0){

                        ++divisores;

                    }
                }
                if(divisores == 2){
                    objeto.somaPrimos();

                }
            }

        } else {
            // Repete o mesmo processo do IF acima, porem para a outra metade do numero.
            int metade = objeto.getNumeroMax()/2;

            for(int i=1; i<=metade; i++){
                int divisores = 0;
                for(int j=1; j<=i; j++){
                    if (i%j == 0){

                        ++divisores;
                    }

                }
                if(divisores == 2){
                    objeto.somaPrimos();

                }
            }


        }

    }


}
