package model;

public class Parametric {
    public Parametric(Figures figures) {
        this.figures = figures;
    }

    public Parametric() {
    }

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }

    private Figures figures;
}
