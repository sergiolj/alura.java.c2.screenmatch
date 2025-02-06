package br.alura.screenmatch.models;

import br.alura.screenmatch.calcs.Rateable;

public class Movie extends Title{
    private String director;

    public Movie() {
        super();
    }

    public Movie(String title, int releaseYear, String genre, int duration, String director) {
        super(title, releaseYear, genre, duration);
        this.director = director;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
//    public String toString() {
//        String movieTechnicalSheet;
//        movieTechnicalSheet = """
//            Title: %s\t Release Year: %d\t Genre: %s\t Duration: %d
//            Director: %s
//            Ratting Stars: %d
//            """.formatted(super.getTitle(),super.getReleaseYear(),super.getGenre(),super.getDuration(), this.director, super.getRate());
//        return movieTechnicalSheet;
//    }
    public String toString(){
        return "[" + this.getTitle() + " (" + this.getReleaseYear()+") ]";
    }

}
