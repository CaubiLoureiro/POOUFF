import java.util.Scanner;
public class Question05 {
    public static void main(String[] args){
        int factorial = 1, input;
        Scanner keyboard = new Scanner(System.in);
        input = keyboard.nextInt();

        if (input < 1){
            System.out.println(-1);
        }else{
            for (int i = 1; i<(input+1); i++){
                factorial *= i;
            }
        }
        System.out.println(factorial);
    }
}