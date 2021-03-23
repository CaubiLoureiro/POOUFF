package tarefa04.question06;

public enum Evolucoes {
    PRIMEIRA(1), SEGUNDA(2);

    private int evo;

    Evolucoes(int evo) {
        this.evo = evo;
    }

    public int getEvo() {
        return evo;
    }
}
