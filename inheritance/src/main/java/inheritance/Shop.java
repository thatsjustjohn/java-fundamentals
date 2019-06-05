package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Shop implements Business {
    private String name;
    private float stars;
    private int price;
    private String description;
    private List<Review> reviews;

    public Shop(String name, String description, int price){
        this.name = name;
        this.stars = 0;
        this.description = description;
        this.price = price;
        this.reviews = new ArrayList<>();
    }

    public Shop(String name, String description, int price, List<Review> reviews) {
        this(name, description, price);
        this.reviews = reviews;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
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
    public void addReview(Review newReview){
        // Get total stars
        reviews.add(newReview);
        float totalStars = 0;
        for(Review review : this.reviews){
            totalStars += review.getStars();
        }
        this.stars = totalStars / this.reviews.size();
    }

    @Override
    public String toString(){
        StringBuilder dollar = new StringBuilder();
        for(int i = 0; i < this.price; i++){
            dollar.append("$");
        }
        StringBuilder returnString = new StringBuilder();
        returnString.append(String.format("%s has %.1f out of 5 stars and has a price of %s and have %d reviews\n",this.name, this.stars, dollar.toString(), this.reviews.size()));
        returnString.append(String.format("Description: %s\n", this.description));
        returnString.append("Reviews:\n");
        for(int i = 0; i < this.reviews.size(); i++){
            returnString.append(this.reviews.get(i).toString());
        }
        return returnString.toString();
    }
}
