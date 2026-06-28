package core.basesyntax;

import java.awt.*;

public class RightTriangle extends Figure implements FigureActions {
    private final int sideA;
    private final int sideB;

    public RightTriangle(int sideA, int sideB, String color) {
        super("Right Triangle", color);
        this.sideA = sideA;
        this.sideB = sideB;
        super.draw = draw();
    }

    @Override
    public double getArea() {
        return sideA * sideB / 2.0;
    }

    @Override
    public String draw() {
        return "Figure: " + figureName + " area: "
                + getArea() + " sq. units, firstLeg: "
                + sideA + " units, secondLeg: "
                + sideB + " units, color: "
                + color;
    }
}
