public class PythagoreanTriple {
    private int side1;
    private int side2;
    private int hypotenuse;

    public PythagoreanTriple(int m, int n) {
        this.side1 = m * m - n * n;
        this.side2 = 2 * m * n;
        this.hypotenuse = m * m + n * n;
    }

    public int getSide1() {
        return side1;
    }

    public int getSide2() {
        return side2;
    }

    public int getHypotenuse() {
        return hypotenuse;
    }
}