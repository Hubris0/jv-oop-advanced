package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        int numberOfFigures = 6;
        boolean isDefaultFigure = false;
        Figure[] figures = new Figure[numberOfFigures];
        FigureSupplier figureSupplier = new FigureSupplier();
        for (int i = 0; i < numberOfFigures; i++) {
            if (i >= numberOfFigures / 2) {
                isDefaultFigure = true;
            }
            figures[i] = figureSupplier.getRandomFigure(isDefaultFigure);
            System.out.println(figures[i].toString());
        }
    }
}
