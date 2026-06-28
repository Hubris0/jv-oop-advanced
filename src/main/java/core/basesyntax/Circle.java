package core.basesyntax;

public class Circle extends Figure {
    private final int radius;

    public Circle(int radius, String color) {
        super("Circle", color);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + " area: "
                + getArea() + " sq. units, radius: "
                + radius + " units, color: "
                + color;
    }
}
