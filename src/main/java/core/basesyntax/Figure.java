package core.basesyntax;

public class Figure {
    protected final String figureName;
    protected final String color;

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }

    public String draw() {
        return "something went wrong";
    }
}
