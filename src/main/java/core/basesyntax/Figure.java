package core.basesyntax;

public abstract class Figure implements FigureActions {
    protected final String figureName;
    protected final String color;
    protected String draw;

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }
}
