package tarefa04.question03;

public class Main {

    public static void main(String[] args) {

        Pessoa creitin = new Pessoa("Creitin", 1000);
        creitin.addMae("Crotilde", 2000);
        creitin. addPai("Creitão", 5000);
        System.out.println("Nome: "+creitin.getNome());
        System.out.println("Mãe: "+ creitin.mae.getNome());
        System.out.println("Pai: "+ creitin.pai.getNome());
    }


}
