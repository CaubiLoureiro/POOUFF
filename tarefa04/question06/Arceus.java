package tarefa04.question06;

import java.util.ArrayList;

public class Arceus extends Pokemon{

    ArrayList<Ataques> ataques = new ArrayList<>();

    public Arceus(String tipo, double tamanho, String nome, double peso) {
        super(tipo, nome, peso, tamanho);
    }

    @Override
    public void addAtaque(String nome, String efeito, int dano){
        ataques.add(new Ataques(nome, efeito, dano));
    }

    @Override
    public void evoluir(String nome){
        super.evoluir(nome);
        for(Ataques index : ataques){
            index.setDano(index.getDano()*2);
        }
    }

    public void mostrarAtaques(){
        super.printAtaques(ataques);
    }





}
