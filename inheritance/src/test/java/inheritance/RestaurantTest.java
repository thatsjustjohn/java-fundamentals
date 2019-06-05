package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class RestaurantTest {

    @Test
    public void test_toString() {
        Restaurant classUnderTest = new Restaurant("McDonalds", 1);
        classUnderTest.addReview(new Review("John", "This place tastes bad", 3));
        classUnderTest.addReview(new Review( "Jane", "this place tastes awesome", 4));
        assertEquals( "McDonalds has 3.5 out of 5 stars and has a price of $ and have 2 reviews\n" +
        "Reviews:\nAuthor: John\nStars: 3\nBody: This place tastes bad\n" +
        "Author: Jane\nStars: 4\nBody: this place tastes awesome\n",
                classUnderTest.toString()
                );
    }

    @Test
    public void test_addReview_TestAdd(){
        Restaurant classUnderTest = new Restaurant("McDonalds", 1);
        int previousSize = classUnderTest.getReviews().size();
        classUnderTest.addReview(new Review("John", "This place tastes bad", 2));
        assertNotEquals(previousSize, classUnderTest.getReviews().size());
    }

    @Test
    public void test_addReview_TestStars(){
        Restaurant classUnderTest = new Restaurant("McDonalds", 1);
        classUnderTest.addReview(new Review("John", "This place tastes bad", 2));
        classUnderTest.addReview(new Review( "Jane", "this place tastes awesome", 4));
        assertEquals(3.0,
                classUnderTest.getStars(),
                0);
    }
}