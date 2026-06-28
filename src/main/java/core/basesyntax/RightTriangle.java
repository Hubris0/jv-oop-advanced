package core.basesyntax;

public class RightTriangle extends Figure {
    private final int sideA;
    private final int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super("Right Triangle", color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }
}
