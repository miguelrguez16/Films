package com.films.Films.Entity.MoviesUtils;

public class Awards {

    private int wind, nominations;
    private String text;


    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = wind;
    }

    public int getNominations() {
        return nominations;
    }

    public void setNominations(int nominations) {
        this.nominations = nominations;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Awards{" +
                "wind=" + wind +
                ", nominations=" + nominations +
                ", text='" + text + '\'' +
                '}';
    }
}
