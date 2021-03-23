package tarefa04.question04;

public class Quadrilateros extends Formas{

    private double base;
    private double altura;

    public Quadrilateros(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.setArea(this.base * this.altura);
    }

}
