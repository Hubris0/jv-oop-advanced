package core.basesyntax;

public class Figure {
    protected final String figureName;
    protected final String color;
    protected String draw;

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }
}
