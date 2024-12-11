import br.alura.screenmatch.models.Movie;

public class MainDeprecated {
    public static void main(String[] args) {
    Movie movie = new Movie("The Godfather",1972,"Police and Drama", 175,"Francis Ford Coppola");
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

    }
}