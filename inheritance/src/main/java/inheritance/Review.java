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
        return this.getBody();
    }

    public String getAuthor(){
        return this.getAuthor();
    }

    public int getStars(){
        return this.stars;
    }

    @Override
    public String toString() {
        return String.format("Author: %s\nStars: %d\n%s",this.author, this.stars, this.body);
    }
}


