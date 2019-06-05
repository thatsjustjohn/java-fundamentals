package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class MovieReviewTest {

    @Test
    public void test_movie_toString() {
        MovieReview review = new MovieReview("John", "This movie is good", 5, "John Wick");
        assertEquals("Author: John\n" +
                "Stars: 5\n" +
                "Movie: John Wick\n" +
                "Body: This movie is good\n",
                review.toString());
    }

    @Test
    public void test_movie_toString_noMovie() {
        MovieReview review = new MovieReview("John", "This movie is good", 5);
        assertEquals("Author: John\n" +
                "Stars: 5\n" +
                "Body: This movie is good\n",
                review.toString());
    }
}