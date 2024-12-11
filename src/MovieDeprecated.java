public class MovieDeprecated {
    private String title;
    private int releaseYear;
    private String genre;
    private String director;
    private String subscriptionType;
    private double rating;
    private int totalRating = 0;
    private int ratingStars = 0;
    private int duration; //br.alura.screenmatch.models.Movie length in minutes


    public MovieDeprecated(){}

    public MovieDeprecated(String title, int releaseYear, String genre, String director, int duration) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.director = director;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
    String movieTechnicalSheet;
    movieTechnicalSheet = """
            Title: %s\t Release Year: %d\t Genre: %s\t Duration: %d
            Director: %s
            Ratting Stars: %d
            """.formatted(this.title,this.releaseYear,this.genre,this.duration, this.director, this.ratingStars);
    return movieTechnicalSheet;
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
}
