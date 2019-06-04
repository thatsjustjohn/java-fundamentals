package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_toString() {
        Restaurant classUnderTest = new Restaurant("Mcdonalds", 0, 1);
        classUnderTest.addReview(new Review("John", "This place tastes bad", 3));
        classUnderTest.addReview(new Review( "Jane", "this place tastes awesome", 4));
        assertEquals("Mcdonalds has 3.5 out of 5 stars and has a price of $ and have 2 reviews",
                classUnderTest.toString()
                );
    }

    @Test
    public void test_addReview_TestAdd(){
        Restaurant classUnderTest = new Restaurant("Mcdonalds", 4, 1);
        int previousSize = classUnderTest.getReviews().size();
        classUnderTest.addReview(new Review("John", "This place tastes bad", 2));
        assertNotEquals(previousSize, classUnderTest.getReviews().size());
    }

    @Test
    public void test_addReview_TestStars(){
        Restaurant classUnderTest = new Restaurant("Mcdonalds", 0, 1);
        classUnderTest.addReview(new Review("John", "This place tastes bad", 2));
        classUnderTest.addReview(new Review( "Jane", "this place tastes awesome", 4));
        assertEquals(3.0,
                classUnderTest.getStars(),
                0);
    }
}