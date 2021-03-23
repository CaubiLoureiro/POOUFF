package tarefa04.question04;

public class Triangulo extends Formas{
    private TipoTriangulo tipo;
    private double lado;
    private double base;
    private double altura;

    public Triangulo(TipoTriangulo tipo, double lado) {
        this.tipo = tipo;
        this.lado = lado;
        this.setArea((lado * lado * Math.sqrt(3))/4);
    }

    public Triangulo(TipoTriangulo tipo, double base, double altura) {
        this.tipo = tipo;
        this.base = base;
        this.altura = altura;
        this.setArea((base * altura)/2);
    }


}
