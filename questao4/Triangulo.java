class Triangulo {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo(int lado1, int lado2, int lado3) throws DimensoesInvalidasException {
        if (!validaDimensoes(lado1, lado2, lado3)) {
            throw new DimensoesInvalidasException("As dimensões fornecidas não formam um triângulo ok.");
        }
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) throws DimensoesInvalidasException {
        if (!validaDimensoes(lado1, this.lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensão inválida para lado 1.");
        }
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) throws DimensoesInvalidasException {
        if (!validaDimensoes(this.lado1, lado2, this.lado3)) {
            throw new DimensoesInvalidasException("Dimensão inválida para o lado 2.");
        }
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) throws DimensoesInvalidasException {
        if (!validaDimensoes(this.lado1, this.lado2, lado3)) {
            throw new DimensoesInvalidasException("Dimensão inválida para o lado 3.");
        }
        this.lado3 = lado3;
    }

    private boolean validaDimensoes(int lado1, int lado2, int lado3) {
        return lado1 > Math.abs(lado2 - lado3) && lado1 < (lado2 + lado3) &&
               lado2 > Math.abs(lado1 - lado3) && lado2 < (lado1 + lado3) &&
               lado3 > Math.abs(lado1 - lado2) && lado3 < (lado1 + lado2);
    }

    @Override
    public String toString() {
        return "Triângulo: lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3;
    }
}
