public class Movie {
    String title;
    int releaseYear;
    String genre;
    String director;
    String subscriptionType;
    double rating;
    int totalRating = 0;
    int ratingStars = 0;
    int duration; //Movie length in minutes

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
