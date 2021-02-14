import java.util.Scanner;
public class Question07 {
    public static void main(String[] args){
        int pessima = 0, ruim = 0 , boa = 0, otima = 0, input;
        Scanner keyboard = new Scanner(System.in);


        while (true){
            input = keyboard.nextInt();

            if (input>=0 && input<=25){
                pessima++;
            }else if(input>25 && input<=50){
                ruim++;
            }else if(input>50 && input<=75){
                boa++;
            }else if(input>75 && input<=100){
                otima ++;
            }else{
                break;
            }
        }
        int sum = pessima + ruim + boa + otima;

        System.out.println(((pessima*100)/sum)+"% dos clientes acham péssimo");
        System.out.println((ruim*100/sum)+"% dos clientes acham ruim");
        System.out.println((boa*100/sum)+"% dos clientes acham bom");
        System.out.println((otima*100/sum)+"% dos clientes acham ótimo");
    }
}
