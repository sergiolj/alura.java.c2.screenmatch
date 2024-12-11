package br.alura.screenmatch.models;

public class Title {
    private String title;
    private int releaseYear;
    private String genre;
    private String subscriptionType;
    private double rating;
    private int totalRating = 0;
    private int ratingStars = 0;
    private int duration;

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

    public int getRatingStars() {
        return ratingStars;
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

    /*
        Methods
         */
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
}
