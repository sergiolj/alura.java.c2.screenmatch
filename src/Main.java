//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Movie movie = new Movie();

    movie.title = "The Godfather";
    movie.releaseYear = 1972;
    movie.duration = 175;
    movie.director = "Francis Ford Coppola";
    movie.genre = "Police and Drama";

    movie.userRating(5.4);
    movie.showTechnicalSheet();

    movie.userRating(10.0);
    movie.userRating(9.5);

    movie.showTechnicalSheet();
    }
}