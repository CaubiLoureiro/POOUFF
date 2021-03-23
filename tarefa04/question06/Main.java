package tarefa04.question06;

public class Main {
    public static void main(String[] args) {


        Pikachu pikachu = new Pikachu("Elétrico", 1, "Picachu", 10);
        Arceus arceus = new Arceus("Todos", 5, "Arceus", 200);

        pikachu.setExp(4000);
        arceus.setExp(5000);

        pikachu.batalhar(arceus);

        pikachu.evoluir("Pikachu");
        arceus.evoluir("Arceus");



    }
}
