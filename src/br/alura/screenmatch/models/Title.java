package br.alura.screenmatch.models;

import br.alura.screenmatch.calcs.Rateable;

public class Title implements Rateable, Comparable<Title> {
    private String title;
    private int releaseYear;
    private String genre;
    private String subscriptionType;
    private double rating;
    private int totalRating = 0;
    private int ratingStars = 0;
    private int duration;
    protected String technicalSheet;

    public Title() {}

    public Title(String title, int releaseYear, String genre, int duration) {
        this.duration = duration;
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    /*
        Getters and Setters
         */
    public String getTitle() {
        return title;
    }
    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void showTechnicalSheet(){
        System.out.println(this.toString());
    }

    public void userRating(double rating){
        this.rating += rating;
        totalRating++;
        setRatingStars();
    }

    public void setRatingStars(){
        this.ratingStars = (int) (rating/totalRating)/2;
    }

    @Override
    public int compareTo(Title o) {
        return this.getTitle().compareTo(o.getTitle());
    }

    @Override
    public int getRate() {
        return this.ratingStars;
    }
    public String toString(){
        return "";
    }
}
