package tarefa05.questão01;

public abstract class FormaGeometrica {

    private float area;
    private float perimetro;

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public abstract void calcularArea(float num);
    public abstract void calcularArea(float num1, float num2);

    public abstract  void calcularPerimetro(float num);
    public abstract  void calcularPerimetro(float num1, float num2);
    public abstract  void calcularPerimetro(float num1, float num2, float num3);

    public void mostrarArea(){
        System.out.printf("Área: %.2f\n", getArea());
    }

    public void mostrarPerimetro(){
        System.out.printf("Perímetro: %.2f\n", getPerimetro());
    }
}
