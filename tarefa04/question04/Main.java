package tarefa04.question04;

import tarefa04.question09.SomaArea;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Formas> forms = new ArrayList<Formas>();
        forms.add(new Quadrado(10,20));
        forms.add(new Retangulo(10, 30));
        forms.add(new Triangulo(TipoTriangulo.TRIANGULO_EQUILATERO, 10));
        forms.add(new Triangulo(TipoTriangulo.TRIANGULO_RETANGULO, 10, 20));
        forms.add(new Circulo(10));

        for (Formas index : forms){
            index.printArea();
        }
    }
}
