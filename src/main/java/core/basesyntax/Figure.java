package core.basesyntax;

public class Figure implements FigureActions {
    protected final String figureName;
    protected final String color;

    protected Figure(String name, String color) {
        this.figureName = name;
        this.color = color;
    }

    @Override
    public String draw() {
        return "something went wrong, please check your figure";
    }

    @Override
    public double getArea() {
        return 0;
    }
}
