package model;

public class Figures {
    public Figures(String figureKeyOne, String figureKeyTwo, String figureKeyThree, String figureKeyFour, String figureKeyFive) {
        this.figureKeyOne = figureKeyOne;
        this.figureKeyTwo = figureKeyTwo;
        this.figureKeyThree = figureKeyThree;
        this.figureKeyFour = figureKeyFour;
        this.figureKeyFive = figureKeyFive;
    }

    public Figures() {
    }

    private String figureKeyOne;
    private String figureKeyTwo;
    private String figureKeyThree;
    private String figureKeyFour;
    private String figureKeyFive;

    public String getFigureKeyOne() {
        return figureKeyOne;
    }

    public void setFigureKeyOne(String figureKeyOne) {
        this.figureKeyOne = figureKeyOne;
    }

    public String getFigureKeyTwo() {
        return figureKeyTwo;
    }

    public void setFigureKeyTwo(String figureKeyTwo) {
        this.figureKeyTwo = figureKeyTwo;
    }

    public String getFigureKeyThree() {
        return figureKeyThree;
    }

    public void setFigureKeyThree(String figureKeyThree) {
        this.figureKeyThree = figureKeyThree;
    }

    public String getFigureKeyFour() {
        return figureKeyFour;
    }

    public void setFigureKeyFour(String figureKeyFour) {
        this.figureKeyFour = figureKeyFour;
    }

    public String getFigureKeyFive() {
        return figureKeyFive;
    }

    public void setFigureKeyFive(String figureKeyFive) {
        this.figureKeyFive = figureKeyFive;
    }
}
