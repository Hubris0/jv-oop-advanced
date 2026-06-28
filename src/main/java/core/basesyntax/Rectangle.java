package core.basesyntax;

public class Rectangle extends Figure {
    private final int sideA;
    private final int sideB;

    public Rectangle(int sideA, int sideB, String color) {
        super("Rectangle",color);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    protected Rectangle(String name, int sideA, int sideB, String color) {
        super(name, color);
        this.sideA = sideA;
        this.sideB = sideB;
        super.draw = draw();
    }

    @Override
    public double getArea() {
        return sideA * sideB;
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
