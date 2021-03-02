package introducaoaoo.question01;

public class Schedule {
    private Contact contact;


    public void addContact(String name, int number, String address){
        contact = new Contact(name, number, address);
    }

    public void removeContact(){
        contact = null;
    }

    public void seeContact() {

        if (contact != null){
            System.out.println("Name: " + contact.getName());
            System.out.println("Number: " + contact.getNumber());
            System.out.println("Address" + contact.getAddress());
        }
        else {
            System.out.println("No contact saved");
        }
    }
}