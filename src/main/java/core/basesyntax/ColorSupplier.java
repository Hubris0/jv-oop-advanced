package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private final Colors[] colors = Colors.values();
    private final Random random = new Random();

    ColorSupplier() {
    }

    public String getRandomColor() {
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].name();
    }

    public String getDefaultColor() {
        return Colors.WHITE.name();
    }
}
