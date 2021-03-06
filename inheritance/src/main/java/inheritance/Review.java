package inheritance;

public class Review {
    private String author;
    private String body;
    private int stars;

    public Review( String author, String body, int stars){
        this.author = author;
        this.body = body;
        this.stars = stars;
    }

    public String getBody(){
        return this.body;
    }

    public String getAuthor(){
        return this.author;
    }

    public int getStars(){
        return this.stars;
    }

    @Override
    public String toString() {
        return String.format("Author: %s\nStars: %d\nBody: %s\n",this.author, this.stars, this.body);
    }
}


