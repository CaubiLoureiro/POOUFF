package tarefa04.question07;

public enum DiaDaSemana {
    DOMINGO(1), SEGUNDA(2), TERCA(3), QUARTA(4), QUINTA(5), SEXTA(6),SABADO(7);

    private int dia;

    DiaDaSemana(int dia){
        this.dia = dia;
    }

    public int getDia() {
        return dia;
    }

    public boolean ehDiaUtil(){
        if(this.getDia() != 1 && this.getDia() != 7){
            return true;
        }else{
            return false;
        }
    }
}
