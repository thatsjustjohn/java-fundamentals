package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements Business {
    private String name;
    private float stars;
    private int price;
    private List<Review> reviews;

    public Restaurant(String name, int price) {
        this.name = name;
        this.stars = 0;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Restaurant(String name, int stars, int price, List<Review> reviews) {
        this(name, price);
        this.reviews = reviews;
        this.updateStars();
    }

    @Override
    public String getName(){
        return this.name;
    }

    public int price(){
        return this.price;
    }

    @Override
    public float getStars(){
        return this.stars;
    }

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

    public String toString(){
        StringBuilder dollar = new StringBuilder();
        for(int i = 0; i < this.price; i++){
            dollar.append("$");
        }
        StringBuilder returnString = new StringBuilder();
        returnString.append(String.format("%s has %.1f out of 5 stars and has a price of %s and have %d reviews\n",this.name, this.stars, dollar.toString(), this.reviews.size()));
        returnString.append("Reviews:\n");
        for(int i = 0; i < this.reviews.size(); i++){
            returnString.append(this.reviews.get(i).toString());
        }
        return returnString.toString();
    }
}
