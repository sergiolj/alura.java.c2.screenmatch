package br.alura.screenmatch.main;

import br.alura.screenmatch.calcs.Calculator;
import br.alura.screenmatch.models.Movie;
import br.alura.screenmatch.models.Series;

public class Main {
    public static void main(String[] args) {
    Movie movie = new Movie("The Godfather",1972,"Police and Drama",175,"Francis Ford Coppola");
    Movie movie1 = new Movie();


    movie1.setTitle("The Goonies");
    movie1.setReleaseYear(1985);
    movie1.setGenre("Adventure, Comedy, Family");
    movie1.setDirector("Richard Donner");
    movie1.setDuration(111);

    movie1.userRating(8.5);
    movie1.showTechnicalSheet();

    movie.userRating(5.4);
    movie.showTechnicalSheet();

    movie.userRating(10.0);
    movie.userRating(9.5);

    movie.showTechnicalSheet();

        Series series = new Series();
        series.setTitle("Lost");
        series.setEpisodeDuration(45);
        series.setEpisodes(20);
        series.setSeasons(6);

        //Method setDuration not supported for subclass Series
        //series.setDuration(0);
        System.out.println("The series " + series.getTitle() + " has about " + series.getDuration() + " minutes long");


        Calculator  calc = new Calculator();
        calc.addTitleDuration(series);

        System.out.println(calc.getMarathonHours());

        calc.addTitleDuration(movie);
        calc.addTitleDuration(movie1);

        System.out.println("You will need about "+ calc.getMarathonHours() + " hours to complete your marathon.");
    }
}