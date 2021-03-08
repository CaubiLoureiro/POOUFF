package tarefa03.question03;

public class Data {
    private int dia;
    private int mes1;
    private int ano;
    private String mes2;
    private int diasNoAno;
    private int objetoTipo;


    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes1 = mes;
        this.ano = ano;
        this.objetoTipo = 1;
    }

    public Data(String mes, int dia, int ano){
        this.mes2 = mes;
        this.dia = dia;
        this.ano = ano;
        this.objetoTipo = 2;
    }
    public Data(int diasNoAno, int ano){
        this.diasNoAno = diasNoAno;
        this.ano = ano;
        this.objetoTipo = 3;
    }

    public void printData(){
        if (this.objetoTipo == 1){
            System.out.println(this.dia+"/"+this.mes1+"/"+this.ano);
        }else if (this.objetoTipo == 2){
            System.out.printf("%s %d, %d\n", mes2, dia, ano);
        }
        else{
            System.out.println(this.diasNoAno+" "+this.ano);
        }
    }

}
