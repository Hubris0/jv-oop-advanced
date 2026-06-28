package core.basesyntax;

public abstract class Figure implements Drawable, Measurable {
    protected final String figureName;
    protected final String color;

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }
}
