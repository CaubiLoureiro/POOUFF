package tarefa02.question03;

public class Main {
    public static void main(String[] args){

        Door door = new Door("Blue", 2.05, 1.10);


        door.setColor("Pink");
        door.setHeight(2.00);
        door.setWidth(1.00);
        door.setOpen();
        System.out.println(door.estaAberta());

        door.setClosed();
        System.out.println(door.estaAberta());









    }
}
