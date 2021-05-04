package tarefa07.questao01;

public class QuantidadeDePrimos {
    private static int qtdPrimos;
    private int numeroMax;


    public QuantidadeDePrimos(int numeroMax){
        this.numeroMax = numeroMax;
    }


    public int getNumeroMax(){
        return this.numeroMax;
    }

   public void somaPrimos(){
        this.qtdPrimos++;
   }

    public static int getQtdPrimos() {
        return qtdPrimos;
    }
}
