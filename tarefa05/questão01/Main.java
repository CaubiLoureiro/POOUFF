package tarefa05.questão01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Retangulo retangulo = new Retangulo();
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Triangulo triangulo = new Triangulo();

        retangulo.calcularArea(2,3);
        retangulo.calcularPerimetro(2,3);
        circulo.calcularArea(10);
        circulo.calcularPerimetro(10);
        quadrado.calcularArea(5);
        quadrado.calcularPerimetro(5);
        triangulo.calcularArea(10,20);
        triangulo.calcularPerimetro(12,15,16);

        retangulo.mostrarArea();
        retangulo.mostrarPerimetro();
        circulo.mostrarArea();
        circulo.mostrarPerimetro();
        quadrado.mostrarArea();
        quadrado.mostrarPerimetro();
        triangulo.mostrarArea();
        triangulo.mostrarPerimetro();


    }
}
