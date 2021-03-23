package tarefa04.question05;

public class Main {
    public static void main(String[] args){

        Agenda agenda = new Agenda();

        agenda.addContato("11155484", "151184844","Rua arroz", 1000000);
        agenda.addContato("Creiton", "15154987652", "Rua do Creiton","12/12");

        agenda.printContatos();
        agenda.printContato("11155484", "151184844","Rua arroz", 1000000);
        agenda.removerContato("11155484", "151184844","Rua arroz", 1000000);
        agenda.printContato("Creiton", "15154987652", "Rua do Creiton","12/12");
        agenda.removerContato("Creiton", "15154987652", "Rua do Creiton","12/12");
        agenda.printContatos();

    }
}
