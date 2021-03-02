package introducaoaoo.question03;

public class Main {
    public static void main(String[] args){
        Door door = new Door();

        door.setColor("Blue");
        door.setColor("Pink");
        door.setHeight(2.05);
        door.setWidth(1.10);
        door.setOpen();
        System.out.println(door.estaAberta());

        door.setClosed();
        System.out.println(door.estaAberta());









    }
}
