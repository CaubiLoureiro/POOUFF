public class Questao06 {
    public static void main(String[] args){
        int anterior = 0, proximo = 1, auxiliar;

        while (proximo < 100){
            auxiliar = proximo;
            proximo = proximo + anterior;
            anterior = auxiliar;
            System.out.printf("%d ",proximo);
        }


    }
}