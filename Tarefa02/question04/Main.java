package introducaoaoo.question04;

public class Main {
    public static void main(String[] args){
        House house = new House();
        house.closedDoor1();
        house.openDoor2();
        house.openDoor3();
        house.quantasPortasEstaoAbertas();

        house.closedDoor2();
        house.quantasPortasEstaoAbertas();
    }
}
