package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    private String name;
    private int stars;
    private int price;
    private List<Review> reviews;

    public Restaurant(String name, int stars, int price) {
        this.name = name;
        this.stars = stars;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, int stars, int price, List<Review> reviews) {
        this(name, stars, price);
        this.reviews = reviews;
    }

    public String getName(){
        return this.name;
    }

    public int getStars(){
        return this.stars;
    }

    public int price(){
        return this.price;
    }

    public List<Review> getReviews() {
        return this.reviews;
    }

    public void addReview(Review newReview){
        // Get total stars
        int totalStars = this.stars * this.reviews.size();
        reviews.add(newReview);
        totalStars += newReview.getStars();
        // Recalculate average
        this.stars = totalStars / this.reviews.size();
    }

    @Override
    public String toString(){
        StringBuilder dollar = new StringBuilder();
        for(int i = 0; i < this.price; i++){
            dollar.append("$");
        }
        return String.format("%s has %d out of 5 stars and has a price of %s and have %d reviews",this.name, this.stars, dollar.toString(), this.reviews.size());
    }
}
