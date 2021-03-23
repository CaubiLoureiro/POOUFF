package tarefa04.question04;

public class Circulo extends Formas{
    private double raio;
    private static final double PI = 3.141526535;

    public Circulo(double raio) {
        this.raio = raio;
        this.setArea(2 * PI * raio * raio);
    }


}
