package tarefa04.question04;

public enum TipoTriangulo {
    TRIANGULO_RETANGULO("Retangulo"), TRIANGULO_EQUILATERO("Equilatero");

    private String tipoDeTriangulo;

    TipoTriangulo(String triangulo) {
        tipoDeTriangulo = triangulo;
    }

    public String getTipoDeTriangulo() {
        return tipoDeTriangulo;
    }
}
