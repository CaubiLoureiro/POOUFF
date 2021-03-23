package tarefa04.question08;

public class Par<F,s> {
    private F primeiro;
    private s segundo;

    public Par(F primeiro, s segundo){
        this.primeiro = primeiro;
        this.segundo = segundo;
    }

    public F getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(F primeiro) {
        this.primeiro = primeiro;
    }

    public s getSegundo() {
        return segundo;
    }

    public void setSegundo(s segundo) {
        this.segundo = segundo;
    }

    public void mostrarPar(){
        System.out.printf("%d, %d", this.getPrimeiro(), this.getSegundo());
    }

}
