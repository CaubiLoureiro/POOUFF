package tarefa05.questão01;

public class Quadrado extends Retangulo{

    @Override
    public void calcularArea(float lado){
        this.setArea(lado * lado);
    }

    @Override
    public void calcularPerimetro(float lado){
        this.setPerimetro(lado * lado * lado * lado);
    }
}
