package tarefa02.question02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String sumAge;
        Scanner keyboard = new Scanner(System.in);

        People people = new People("name", 0);

        System.out.println("Do you wanna have a birthday? Yes or No");
        sumAge = keyboard.nextLine();

        while(sumAge.equals("Yes") == true || sumAge.equals("yes") == true){
            people.setAge(people.getAge() + 1);

            System.out.println("Do you wanna have a birthday? Yes or No");
            sumAge = keyboard.nextLine();
        }
        System.out.println("The person's current age is " + people.getAge());
    }
}
