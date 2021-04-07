package tarefa05.questão05;

public class Servico implements Recebivel{

    private String discricao;
    private int horas;
    private double precoHora;

    public Servico(String discricao, int horas, double precoHora){
        this.setDiscricao(discricao);
        this.setHoras(horas);
        this.setPrecoHora(precoHora);
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(double precoHora) {
        this.precoHora = precoHora;
    }

    @Override
    public double totalizarReceita() {
        return getHoras() * getPrecoHora();
    }





}
