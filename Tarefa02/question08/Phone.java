package introducaoaoo.question08;


import java.util.Scanner;

public class Phone {
    private int battery;


    public Phone(){
        this.battery = 100;
    }


    public void sendMessage() {
        if (battery >= 1){
            String message;
            int number;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Write your message:");
            message = keyboard.nextLine();
            System.out.println("What number do you wanna send:");
            number = keyboard.nextInt();
            System.out.println("Message sent");
            battery -= 1;
        }
    }

    public void connect() {
        if (battery >= 5){
            int time;
            int number;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Which number do you want to call?");
            number = keyboard.nextInt();
            System.out.println("Enter how many seconds the call will take");
            time = keyboard.nextInt();
            time = time/5;
            if (time > battery){
                System.out.println("The phone will hang up before the call ends");
                System.out.println("Do you wanna charge the battery?");
                Scanner keyboar = new Scanner(System.in);
                String option = keyboar.nextLine();
                if(option.equals("No")) {
                    this.battery = 0;

                }else{
                    this.chargeBattery();
                    System.out.println("Call successfully placed");
                }

            }else{
                this.battery -= time;
                System.out.println("Call successfully placed");
            }
        }else{
            System.out.println("No battery to connect");
            System.out.println("Charge the battery");
        }
    }

    public void printBattery(){
        System.out.println(this.battery);
    }

    public void chargeBattery(){
        this.battery = 100;
    }
}
