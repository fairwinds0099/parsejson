package model;

public class Defaults {

    public Defaults(Figures figures) {
        this.figures = figures;
    }

    public Defaults() {
    }

    private Figures figures;

    public Figures getFigures() {
        return figures;
    }

    public void setFigures(Figures figures) {
        this.figures = figures;
    }
}
