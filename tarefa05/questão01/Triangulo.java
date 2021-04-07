package tarefa05.questão01;

public class Triangulo extends FormaGeometrica{



    @Override
    public void calcularArea(float num) {
        System.out.println("Informe a altura e a base nos parâmetros");

    }

    @Override
    public void calcularArea(float altura, float base) {
        this.setArea((base * altura) / 2);

    }

    @Override
    public void calcularPerimetro(float num) {
        System.out.println("Faltou mais 2 lados do triângulo");
    }

    @Override
    public void calcularPerimetro(float num1, float num2) {
        System.out.println("Faltou mais 1 lados do triângulo");
    }

    @Override
    public void calcularPerimetro(float lado1, float lado2, float lado3) {
        this.setArea(lado1 + lado2 + lado3);
    }
}
