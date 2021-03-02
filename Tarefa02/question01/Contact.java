package introducaoaoo.question01;

public class Contact {
    private String name;
    private String address;
    private int number;


    public Contact(String name, int number, String address){
        this.setName(name);
        this.setNumber(number);
        this.setAddress(address);
    }
    public void status(){
        System.out.println(getName());
        System.out.println(getAddress());
        System.out.println(getNumber());
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public String getName() {
        return name;
    }
    public String getAddress(){
        return address;
    }

    public int getNumber() {
        return number;
    }
}
