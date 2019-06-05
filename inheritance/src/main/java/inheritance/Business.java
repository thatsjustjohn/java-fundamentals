package inheritance;

import java.util.List;

public interface Business {

    public String getName();
    public float getStars();
    public List<Review> getReviews();
    public void addReview(Review newReview);
    public String toString();

}
