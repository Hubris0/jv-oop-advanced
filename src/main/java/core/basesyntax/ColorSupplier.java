package core.basesyntax;

import java.util.Random;

public final class ColorSupplier {
    private static final Colors[] colors = Colors.values();
    private static final Random random = new Random();

    private ColorSupplier() {
    }

    public static String getRandomColor(){
        int randomIndex = random.nextInt(colors.length);
        return colors[randomIndex].name();
    }

    public static String getDefaultColor(){
        return Colors.WHITE.name();
    }
}
