package inheritance;


public class MovieReview extends Review {
    private String movie;

    public MovieReview(String author, String body, int stars) {
        super(author, body, stars);
    }

    public MovieReview(String author, String body, int stars, String movie) {
        this(author, body, stars);
        this.movie = movie;
    }

    public String getMovie(){
        return this.movie;
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder();
        returnString.append(String.format("Author: %s\nStars: %d\n",this.getAuthor(), this.getStars()));
        if(movie != null) returnString.append(String.format("Movie: %s\n", this.getMovie()));
        returnString.append(String.format("Body: %s\n",this.getBody()));
        return returnString.toString();
    }
}
