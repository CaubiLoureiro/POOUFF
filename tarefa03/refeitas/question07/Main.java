package tarefa02.question07;

public class Main {
    public static void main(String[] args){
        Market market = new Market();
        market.addInInventory("cookie", 5.5, 1000);
        market.addInInventory("apple", 0.5, 300);
        market.selling();

    }
}
