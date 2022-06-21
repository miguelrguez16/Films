package com.films.Films.Entity.MoviesUtils;

public class Viewer {
    private Double rating;
    private int numReviews;
    private int meter;

    public Viewer(Double rating, int numReviews, int meter) {
        this.rating = rating;
        this.numReviews = numReviews;
        this.meter = meter;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public int getNumReviews() {
        return numReviews;
    }

    public void setNumReviews(int numReviews) {
        this.numReviews = numReviews;
    }

    public int getMeter() {
        return meter;
    }

    public void setMeter(int meter) {
        this.meter = meter;
    }

    @Override
    public String toString() {
        return "viewer{" +
                "rating=" + rating +
                ", numReviews=" + numReviews +
                ", meter=" + meter +
                '}';
    }
}
