import java.util.Scanner;
public class Question02{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int R, S, T;
        R = keyboard.nextInt();
        S = keyboard.nextInt();
        T = keyboard.nextInt();

        if ((R>T) && (R>S)){
            System.out.println(R);

        }else if((T>R) && (T>S)){
            System.out.println(T);
        }else{
            System.out.println(S);
        }

    }

}