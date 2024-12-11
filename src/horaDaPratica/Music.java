package horaDaPratica;

public class Music {
    String title;
    String artist;
    int releaseYear;

    double rating;
    int counterRating;
    int ratingStars;

    public Music(String title, String artist, int releaseYear) {
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.rating = 0;
        this.counterRating = 0;
        this.ratingStars = 0;
    }

    public void userRating(double rating) {
        this.rating += rating;
        counterRating++;
        ratingStars();
    }

    private void ratingStars() {
        this.ratingStars = (int) (rating/counterRating)/2;
    }

    public void technicalSheet(){
        String description;
        description = """
                Music title: %s
                Artist: %s
                ReleaseYear: %d
                Rating: %d
                """.formatted(this.title, this.artist, this.releaseYear, this.ratingStars);
        System.out.println(description);
    }

    public static void main(String[] args) {
        Music music = new Music("Billie Jean","Michael Jackson",1982);
        music.technicalSheet();

        music.userRating(4);
        music.technicalSheet();

        music.userRating(10);
        music.userRating(10);
        music.userRating(10);
        music.userRating(10);

        music.technicalSheet();


    }

}
