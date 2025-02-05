package br.alura.screenmatch.main;

import br.alura.screenmatch.calcs.Calculator;
import br.alura.screenmatch.calcs.FilterTrends;
import br.alura.screenmatch.models.Episode;
import br.alura.screenmatch.models.Movie;
import br.alura.screenmatch.models.Series;
import br.alura.screenmatch.models.Title;

import java.util.ArrayList;

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
        series.setAverageEpisodesDuration(45);
        series.setEpisodesPerSeason(20);
        series.setSeasons(6);

        series.userRating(7.0);

        series.showTechnicalSheet();


        Episode episode = new Episode();
        episode.setSeries(series);
        episode.setNumber(1);
        episode.setSeason(1);
        episode.setTitle("Pilot (Part 1)");
        episode.setEpisodeDuration(105);
        episode.userRating(10);

        episode.showTechnicalSheet();

        //Method setDuration not supported for subclass Series
        //series.setDuration(0);
        System.out.println("The series " + series.getTitle() + " has about " + series.getDuration() + " minutes long");


        Calculator  calc = new Calculator();
        calc.addTitleDuration(series);

        System.out.println(calc.getMarathonHours());

        calc.addTitleDuration(movie);
        calc.addTitleDuration(movie1);

        FilterTrends filter = new FilterTrends();
        System.out.println(series.getTitle() + " \nFilter Trends result: ");
        filter.trends(series);


        System.out.println("You will need about "+ calc.getMarathonHours() + " hours to complete your marathon.\n");
        Episode episode2 = new Episode();
        episode2.setSeries(series);
        episode2.setNumber(2);
        episode2.setSeason(1);
        episode2.setWatchedCounter(200);
        episode2.setTitle("Pilot (Part 2)");

        System.out.println(episode2.getTitle() + " \nFilter Trends result: ");
        filter.trends(episode2);

        ArrayList<Title> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie);
        list.add(series);

        System.out.println(list);
        for (Title title : list) {
            if(title instanceof Series s) {
                System.out.println(title.getTitle() + " ["+s.getSeasons()+" Seasons]");
            }else{
                System.out.println(title.getTitle());
            }
        }
        //list.forEach(System.out::println);

    }

}