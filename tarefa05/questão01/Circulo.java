package tarefa05.questão01;

public class Circulo extends FormaGeometrica{
    private final float PI = (float) 3.141526535;

    @Override
    public void calcularArea(float raio) {
        this.setArea(PI * raio * raio);
    }


    @Override
    public void calcularArea(float num1, float num2) {
        System.out.println("Passe somente 1 raio como parâmetro");
    }

    @Override
    public void calcularPerimetro(float raio) {
        this.setArea(2 * PI * raio);
    }

    @Override
    public void calcularPerimetro(float num1, float num2) {
        System.out.println("Passe somente 1 raio como parâmetro");
    }

    @Override
    public void calcularPerimetro(float num1, float num2, float num3) {
        System.out.println("Passe somente 1 raio como parâmetro");

    }
}
