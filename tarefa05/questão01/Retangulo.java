package tarefa05.questão01;

public class Retangulo extends FormaGeometrica{

    @Override
    public void calcularArea(float num) {
        System.out.println("Digite os dois lados do retângulo");

    }

    @Override
    public void calcularArea(float lado1, float lado2) {
        this.setArea(lado1 * lado2);
    }

    @Override
    public void calcularPerimetro(float num) {
        System.out.println("Digite os dois lados do retângulo");

    }

    @Override
    public void calcularPerimetro(float lado1, float lado2) {
        float perimetro = 2 * lado1 + 2 * lado2;
        this.setPerimetro(perimetro);
    }

    @Override
    public void calcularPerimetro(float num1, float num2, float num3) {
        System.out.println("Digite apenas os dois lados do retângulo");

    }
}
