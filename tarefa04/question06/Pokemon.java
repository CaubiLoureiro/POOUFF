package tarefa04.question06;

import java.util.ArrayList;

public abstract class Pokemon {
    private String nome;
    private String tipo;
    private double tamanho;
    private double peso;
    private int hp;
    private int atk;
    private int def;
    private int spAtk;
    private int spDef;
    private int speed;
    private int nivel;
    private int exp;
    private Evolucoes evolucoes;

    public Pokemon(String tipo, String nome, double peso, double tamanho){
        evolucoes = Evolucoes.PRIMEIRA;
        this.exp = 0;
        this.atk = 200;
        this.hp = 200;
        this.def = 200;
        this.peso = peso;
        this.spAtk = 200;
        this.spDef = 200;
        this.speed = 200;
        this. tamanho = tamanho;
        this.nome = nome;
        this. nivel = 1;





    }

    public void evoluir(String nome){
        if(this.exp >= 2000 && evolucoes.getEvo() == 1){

                this.exp = this.exp - 2000;
                this.atk *= 2;
                this.hp *= 2;
                this.def *= 2;
                this.peso *= 2;
                this.spAtk *= 2;
                this.spDef *= 2;
                this.speed *= 2;
                this. tamanho *= 2;
                this.nome = nome;
                evolucoes = Evolucoes.SEGUNDA;
            System.out.println(this.nome+" Primeira evolução");

        }else if(this.exp >= 4000 && evolucoes.getEvo() == 2){

                this.exp = this.exp - 4000;
                this.atk *= 2;
                this.hp *= 2;
                this.def *= 2;
                this.peso *= 2;
                this.spAtk *= 2;
                this.spDef *= 2;
                this.speed *= 2;
                this. tamanho *= 2;
                this.nome = nome;
            System.out.println(this.nome+" Segunda evolução");
        }

    }
    public void batalhar(Pokemon adversario){

        if (adversario.nivel > this.nivel){
            adversario.exp += 100;
            System.out.println(adversario.getNome()+" ganhou a batalha");
        }
        else{
            this.exp += 100;
            System.out.println("Você ganhou a batalha");
        }

    }

    public void printAtaques(ArrayList<Ataques> vetor){
        for(Ataques index : vetor){
            System.out.println(index);
        }
    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getSpAtk() {
        return spAtk;
    }

    public void setSpAtk(int spAtk) {
        this.spAtk = spAtk;
    }

    public int getSpDef() {
        return spDef;
    }

    public void setSpDef(int spDef) {
        this.spDef = spDef;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
        int calc = this.exp/100;
        this.nivel = calc;
    }

    public String getNome() {
        return nome;
    }

    public abstract void addAtaque(String nome, String efeito, int dano);
}
