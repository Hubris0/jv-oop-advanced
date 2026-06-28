package core.basesyntax;

public abstract class Figure {
    private final String figureName;
    private final String color;

    public abstract double getArea();

    public String getFigureName() {
        return figureName;
    }

    public String getColor() {
        return color;
    }

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }
    @Override public String toString() {
        return String.format("Figure: %s, area: %.2f sq.units, color: %s",
                figureName, getArea(), color);
    }
}
