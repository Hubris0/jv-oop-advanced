package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random random = new Random();
    private static final int DEFAULT_FIGURE_COUNT = 5;
    private static final int DEFAULT_FIGURE_CASE = DEFAULT_FIGURE_COUNT;
    private static final int VALUE_LIMIT = 10;

    public Figure getRandomFigure(boolean isDefaultFigure) {
        return switch(isDefaultFigure ? DEFAULT_FIGURE_CASE : random.nextInt(DEFAULT_FIGURE_COUNT)) {
            case 0 -> new Square(random.nextInt(VALUE_LIMIT) + 1
                    , ColorSupplier.getRandomColor());
            case 1 -> new Rectangle(random.nextInt(VALUE_LIMIT) + 1
                    , random.nextInt(VALUE_LIMIT) + 1
                    , ColorSupplier.getRandomColor());
            case 2 -> new RightTriangle(random.nextInt(VALUE_LIMIT) + 1
                    , random.nextInt(VALUE_LIMIT) +1
                    , ColorSupplier.getRandomColor());
            case 3 -> new IsoscelesTrapezoid(random.nextInt(VALUE_LIMIT) + 1
                    ,random.nextInt(VALUE_LIMIT) + 1
                    , random.nextInt(VALUE_LIMIT) + 1
                    , ColorSupplier.getRandomColor());
            case 4 -> new Circle(random.nextInt(VALUE_LIMIT) + 1
                    , ColorSupplier.getRandomColor());
            default -> new Circle(VALUE_LIMIT
                    , ColorSupplier.getDefaultColor());
        };
    }
}
