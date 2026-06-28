package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private final int valueLimit = 10; // Maximum value for the sides and radius of the figures
    private final int sideA = random.nextInt(valueLimit) + 1;
    private final int sideB = random.nextInt(valueLimit) + 1;
    private final int height = random.nextInt(valueLimit) + 1;
    private final int radius = random.nextInt(valueLimit) + 1;

    public Figure getDefaultFigure() {
        return new Circle(valueLimit,
                colorSupplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        String color = colorSupplier.getRandomColor();
        final Figure[] figureNames = {new Square(sideA, color),
                new Rectangle(sideA, sideA, color),
                new RightTriangle(sideA, sideB, color),
                new IsoscelesTrapezoid(sideA, sideB, height, color),
                new Circle(radius, color)};
        int randomIndex = random.nextInt(figureNames.length);
        return figureNames[randomIndex];
    }
}
