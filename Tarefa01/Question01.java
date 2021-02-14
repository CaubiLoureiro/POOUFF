import java.util.Scanner;
public class Question01 {
    public static void main(String[] args){
        int negativos = 0, entrada, numeros;
        Scanner teclado = new Scanner(System.in);
        entrada = teclado.nextInt();
        while (entrada > 0){
            numeros = teclado.nextInt();
            if (numeros < 0) {
                negativos++;
            }
            entrada--;
        }
        System.out.println(negativos);
    }
}