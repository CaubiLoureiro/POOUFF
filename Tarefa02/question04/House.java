package introducaoaoo.question04;

public class House {
    private Door door1 = new Door();
    private Door door2 = new Door();
    private Door door3 = new Door();

    public void openDoor1(){
        door1.setOpen();
    }
    public void openDoor2(){
        door2.setOpen();
    }
    public void openDoor3(){
        door3.setOpen();
    }
    public void closedDoor1(){
        door1.setClosed();
    }
    public void closedDoor2(){
        door2.setClosed();
    }
    public void closedDoor3(){
        door3.setClosed();
    }
    public void quantasPortasEstaoAbertas(){
        System.out.println(door1.estaAberta() + door2.estaAberta() + door3.estaAberta() + " doors are open");
    }

}
