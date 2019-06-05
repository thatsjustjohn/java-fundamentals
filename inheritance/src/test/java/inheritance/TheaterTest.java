package inheritance;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

public class TheaterTest {

    @Test
    public void test_constructor(){
        HashSet<String> movies = new HashSet<>();
        movies.add("John Wick");
        movies.add("Captain Marvell");
        List<Review> reviews = new ArrayList<>();
        reviews.add(new MovieReview("John", "This movie was cool", 4, "Captain " +
                "Marvell"));
        reviews.add(new Review("John", "The popcorn was cool", 5));
        Theater theater = new Theater("Cinerama", 3, reviews, movies);
        assertEquals("Cinerama has 4.5 out of 5 stars and has a price of $$$ and have 2 reviews\n" +
                "Movies:\n" +
                "John Wick\n" +
                "Captain Marvell\n" +
                "Reviews:\n" +
                "Author: John\n" +
                "Stars: 4\n" +
                "Movie: Captain Marvell\n" +
                "Body: This movie was cool\n" +
                "Author: John\n" +
                "Stars: 5\n" +
                "Body: The popcorn was cool\n",
                theater.toString());
    }
    @Test
    public void test_addMovie() {
        Theater theater = new Theater("Cinerama", 3);
        int size = theater.getMovies().size();
        theater.addMovie("John Wick");
        theater.addMovie("Captain Marvell");
        assertEquals("Movie size should be 2",
                2,
                theater.getMovies().size());
        assertFalse("Original size should be different",
                size == theater.getMovies().size());
    }

    @Test
    public void test_removeMovie() {
        Theater theater = new Theater("Cinerama", 3);
        int size = theater.getMovies().size();
        theater.addMovie("John Wick");
        theater.addMovie("Captain Marvell");
        // Test that movies were added and size changed
        assertEquals("Movie size should be 2",
                2,
                theater.getMovies().size());
        // Test one removal
        theater.removeMovie("John Wick");
        assertEquals("Movie size should be 1",
                1,
                theater.getMovies().size());
        theater.removeMovie("Captain Marvell");
        // Test 2 removals
        assertTrue("Original size should be the same",
                size == theater.getMovies().size());
    }

    @Test
    public void test_getStars() {
    }

    @Test
    public void test_getReviews() {
    }

    @Test
    public void test_addReview() {
        Theater theater = new Theater("Cinerama", 3);
        theater.addMovie("John Wick");
        int size = theater.getReviews().size();
        theater.addReview(new MovieReview("John", "This movie was cool", 4, "Captain " +
                "Marvell"));
        assertEquals("Cinerama has 4.0 out of 5 stars and has a price of $$$ and have 1 reviews\n" +
                "Movies:\n" +
                "John Wick\n" +
                "Reviews:\n" +
                "Author: John\n" +
                "Stars: 4\n" +
                "Movie: Captain Marvell\n" +
                "Body: This movie was cool\n",
                theater.toString());
        assertEquals("Sizes should be same if + 1",
                size + 1,
                theater.getReviews().size());
    }

    @Test
    public void test_toString_noReviews() {
        Theater theater = new Theater("Cinerama", 3);
        theater.addMovie("John Wick");
        theater.addMovie("Captain Marvell");
        assertEquals("Cinerama has 0.0 out of 5 stars and has a price of $$$ and have 0 reviews\n" +
                "Movies:\n" +
                "John Wick\n" +
                "Captain Marvell\n" +
                "Reviews:\n",
                theater.toString());
    }

    @Test
    public void test_toString_noReviewsOrMovies() {
        Theater theater = new Theater("Cinerama", 3);
        assertEquals("Cinerama has 0.0 out of 5 stars and has a price of $$$ and have 0 reviews\n" +
                        "Movies:\n" +
                        "Reviews:\n",
                theater.toString());
    }

}