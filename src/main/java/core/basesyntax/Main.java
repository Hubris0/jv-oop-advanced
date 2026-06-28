package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 6;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < numberOfFigures; i++) {
            if (i >= numberOfFigures / 2) {
                figures[i] = figureSupplier.getDefaultFigure();
            } else {
                figures[i] = figureSupplier.getRandomFigure();
            }
            System.out.println(figures[i].draw);
        }
    }
}
