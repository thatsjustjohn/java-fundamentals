package inheritance;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Theater implements Business {
    private String name;
    private float stars;
    private int price;
    private List<Review> reviews;
    private HashSet<String> movies;

    public Theater(String name, int price){
        this.name = name;
        this.stars = 0;
        this.price = price;
        this.reviews = new ArrayList<>();
        this.movies = new HashSet<>();
    }

    public Theater(String name, int price, List<Review> reviews) {
        this(name, price);
        this.reviews = reviews;
        this.updateStars();
    }

    public Theater(String name, int price, List<Review> reviews, HashSet<String> movies) {
        this(name, price, reviews);
        this.movies = movies;
    }

    public void addMovie(String movieName){
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName){
        this.movies.remove(movieName);
    }

    public HashSet<String> getMovies(){
        return this.movies;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public float getStars(){
        return this.stars;
    }

    @Override
    public List<Review> getReviews() {
        return this.reviews;
    }

    @Override
    public void updateStars(){
        float totalStars = 0;
        for(Review review : this.reviews){
            totalStars += review.getStars();
        }
        this.stars = totalStars / this.reviews.size();
    }

    @Override
    public void addReview(Review newReview){
        // Get total stars
        reviews.add(newReview);
        updateStars();
    }

    @Override
    public String toString(){
        StringBuilder dollar = new StringBuilder();
        for(int i = 0; i < this.price; i++){
            dollar.append("$");
        }
        StringBuilder returnString = new StringBuilder();
        returnString.append(String.format("%s has %.1f out of 5 stars and has a price of %s and have %d reviews\n",this.name, this.stars, dollar.toString(), this.reviews.size()));
        returnString.append("Movies:\n");
        for(String movie : movies){
            returnString.append(movie+"\n");
        }
        returnString.append("Reviews:\n");
        for(int i = 0; i < this.reviews.size(); i++){
            returnString.append(this.reviews.get(i).toString());
        }
        return returnString.toString();
    }
}
