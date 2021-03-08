package tarefa02.question07;

import java.util.Scanner;

public class Market {
    private Inventory inventory;
    private String formPayment;


    public Market(){
        inventory = new Inventory();
    }


    public void addInInventory(String name, double price, int amount){
        inventory.addProduct(name, price, amount);
    }

    public void sell(String name, int amount){
        inventory.productSold(name, amount);
    }

    public void payment(){
        System.out.println("What is the payment method?\nMoney,Check or Card");
        Scanner keyboard = new Scanner(System.in);
        formPayment = keyboard.nextLine();
    }

    public void selling(){
        Scanner keyboard = new Scanner(System.in);
        String name;
        int amount;
        this.payment();
        System.out.println("What product do you want?");
        name = keyboard.nextLine();
        System.out.println("how many do you want?");
        amount = keyboard.nextInt();
        this.sell(name, amount);
    }
}
