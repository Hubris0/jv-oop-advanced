package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private final int sideA;
    private final int sideB;
    private final int height;

    public IsoscelesTrapezoid(int sideA, int sideB, int height, String color) {
        super("Isosceles Trapezoid", color);
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;
        super.draw = draw();
    }

    @Override
    public double getArea() {
        return (sideA + sideB) * height / 2.0;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + " area: "
                + getArea() + " sq. units, firstSide: "
                + sideA + " units, secondSide: "
                + sideB + " units, color: "
                + color;
    }
}
