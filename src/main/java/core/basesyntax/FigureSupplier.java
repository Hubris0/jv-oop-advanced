package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getDefaultFigure() {
        final int defaultRadius = 10; // Default radius for the default figure (Circle)
        return new Circle(defaultRadius,
                colorSupplier.getDefaultColor());
    }

    public Figure getRandomFigure() {
        final int valueLimit = 100; // Maximum value for the sides and radius of the figures
        final int sideA = random.nextInt(valueLimit) + 1;
        final int sideB = random.nextInt(valueLimit) + 1;
        final int height = random.nextInt(valueLimit) + 1;
        final int radius = random.nextInt(valueLimit) + 1;
        String color = colorSupplier.getRandomColor();
        final Figure[] figureNames = {new Square(sideA, color),
                new Rectangle(sideA, sideB, color),
                new RightTriangle(sideA, sideB, color),
                new IsoscelesTrapezoid(sideA, sideB, height, color),
                new Circle(radius, color)};
        int randomIndex = random.nextInt(figureNames.length);
        return figureNames[randomIndex];
    }
}
